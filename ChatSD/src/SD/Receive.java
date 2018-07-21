package SD;

import com.google.protobuf.InvalidProtocolBufferException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

/**
 *
 * @author lucas
 */
public class Receive extends Thread {

    private String receptor;
    private MainClass mcs;
    private Protocol.MessageProto.Mensagem mensagem;

    public Receive(String receptor, MainClass mcs) {
        this.receptor = receptor;
        this.mcs = mcs;
    }

    public void transformMessage(byte[] arrBytes) {
        try {
            mensagem = Protocol.MessageProto.Mensagem.newBuilder().mergeFrom(arrBytes).build();
            //mensagem.parseFrom(arrBytes);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("ec2-54-200-229-36.us-west-2.compute.amazonaws.com");
            factory.setUsername("admin");
            factory.setPassword("lucas");

            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            channel.queueDeclare(receptor, false, false, false, null);

            QueueingConsumer consumer = new QueueingConsumer(channel);
            channel.basicConsume(receptor, true, consumer);
            while (true) {
                QueueingConsumer.Delivery delivery = consumer.nextDelivery();
                String w = new String(delivery.getBody());
                transformMessage(delivery.getBody());

                if(!mensagem.getGroup().equals("none") && mensagem.getSender().equals(mcs.getUser()))
                    continue;

                if(mensagem.getGroup().equals("none")){
                    System.out.println("(" + mensagem.getDate() + " às " + mensagem.getTime() + ") "
                            + mensagem.getSender() + " diz: "
                            + new String(mensagem.getContent(0).getBody().toByteArray()));
                }else{
                    System.out.println("(" + mensagem.getDate() + " às " + mensagem.getTime() + ") "
                            + mensagem.getSender() + "/" + mensagem.getGroup() + " diz: "
                            + new String(mensagem.getContent(0).getBody().toByteArray()));
                }
                if (mcs.getReceptor().isEmpty()) {
                    System.out.print(">> ");
                } else {
                    if (mcs.ehGrupo()) {
                        System.out.print(mcs.getReceptor() + "* >> ");
                    } else {
                        System.out.print(mcs.getReceptor() + " >> ");
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
