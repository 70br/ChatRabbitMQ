package br.ufs.dcomp.ExemploRabbitMQ;

import com.rabbitmq.client.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.*;
import java.util.*;
import java.text.*;

public class Both {
  
public static final String ExchangevarNameQue = "Aufgabe5Chat";

public static void main(String[] args) throws Exception {

	Scanner sc = new Scanner(System.in);

    Calendar c = Calendar.getInstance();
    int hora = c.get(Calendar.HOUR_OF_DAY);
    Date data = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

	ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("ec2-18-237-74-219.us-west-2.compute.amazonaws.com");
    factory.setUsername("admin");
    factory.setPassword("lucas");
    
    Connection connection = factory.newConnection();

    Channel channel = connection.createChannel();
    channel.exchangeDeclare("chat", "fanout");
    channel.queueDeclare(ExchangevarNameQue, false, false, false, null);

    Channel channeltoBind = connection.createChannel();
    channeltoBind.queueBind(ExchangevarNameQue, "chat", "");
    QueueingConsumer qr = new QueueingConsumer(channeltoBind);
    channeltoBind.basicConsume(ExchangevarNameQue, true, qr);

    while (true) {
        String user = sc.next();
        channel.basicPublish("chat", "", null, user.getBytes());
        System.out.println("User: " + user);
        
        System.out.println(">> ");
        String dest = sc.next();
        channel.basicPublish("chat", "", null, dest.getBytes());

        String yourmsg = sc.next();
        channel.basicPublish("chat", "", null, yourmsg.getBytes());
        System.out.println("(" + f.format(data) + " às " + hora + ") " + user + " diz: " + yourmsg + "");
    }
}
}