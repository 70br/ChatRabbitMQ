package SD;

import com.google.protobuf.ByteString;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author lucas
 */
public class Group {

    private LocalDateTime ldt;
    
    private Protocol.MessageProto.Mensagem mensagem;
    private Protocol.MessageProto.Mensagem.Conteudo conteudoMensagem;
    
    public Group() {
    }

    public String dataEnvio() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return ldt.format(formatador);
    }

    public String horaEnvio() {
        return ldt.getHour() + ":" + ldt.getMinute();
    }
    
    public void makeMessageProtocol(String grupo, String emissor, String smensagem){
        conteudoMensagem = Protocol.MessageProto.Mensagem.Conteudo.newBuilder()
                .setBody(ByteString.copyFrom(smensagem.getBytes()))
                .setName("none")
                .setType("none")
                .build();
        mensagem = Protocol.MessageProto.Mensagem.newBuilder()
                .setDate(dataEnvio())
                .setGroup(grupo)
                .setSender(emissor)
                .setTime(horaEnvio())
                .addContent(conteudoMensagem)
                .build();
    }

    public ConnectionFactory makeFactory() {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("ec2-54-200-229-36.us-west-2.compute.amazonaws.com");
            factory.setUsername("admin");
            factory.setPassword("lucas");

        return factory;
    }

    public boolean sendMessageToGroup(String user, String group, String message) {
        try {
            Connection connection = makeFactory().newConnection();
            Channel channel = connection.createChannel();
            ldt = LocalDateTime.now();
            makeMessageProtocol(group, user, message);
            channel.basicPublish(group,"", null, mensagem.toByteArray());
            channel.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean addUserToGroup(String user, String group) {
        try {
            Connection connection = makeFactory().newConnection();
            Channel channel = connection.createChannel();

            channel.queueBind(user, group, "");
            channel.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean deleteUser(String user, String group) {
        try {
            Connection connection = makeFactory().newConnection();
            Channel channel = connection.createChannel();
            channel.queueUnbind(user, group, "");
            channel.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean createGroup(String user, String group) {
        try {
            Connection connection = makeFactory().newConnection();
            Channel channel = connection.createChannel();

            channel.exchangeDeclare(group, "fanout");
            channel.queueBind(user, group, "");
            channel.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean deleteGroup(String group) {
        try {
            Connection connection = makeFactory().newConnection();
            Channel channel = connection.createChannel();
            
            
            channel.exchangeDelete(group);
            channel.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
