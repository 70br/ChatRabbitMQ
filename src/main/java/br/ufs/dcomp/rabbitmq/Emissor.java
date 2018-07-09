package br.ufs.dcomp.rabbitmq;

import com.rabbitmq.client.*;
import java.io.IOException;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Emissor {
  
  private static String QUEUE, USER, TIPO;

  public static void main(String[] argv) {
    try{ //executa o outro teste
      boolean rpt = true;
      
      System.out.print ("User: ");
      Scanner usr = new Scanner(System.in);
      USER = usr.nextLine();
      
      System.out.print (">> ");
      Scanner fil = new Scanner(System.in);
      QUEUE = fil.nextLine();
      
      if (QUEUE.indexOf("@") == 0){
        TIPO = "@";
        QUEUE = QUEUE.replace("@", "");
        
      } else if (QUEUE.indexOf("#") == 0){
        TIPO = "#";
        QUEUE = QUEUE.replace("#", "");
        
      }
      
      while (rpt){ //repete até a função retornar false;
        rpt = testeChat2();
      }
      
      System.out.println("\n\n\n ##### \t  CHAT FINALIZADO \t #####");
    }catch (Exception ex) {
      System.out.println("\n \n ##### Não foi possivel conectar ao servidor RABBITMQ ##### \n \n" + ex.toString());
    }
  }
  
  public static boolean testeChat2 () throws Exception{
    ConnectionFactory factory = new ConnectionFactory();
    factory.setUri("amqp://admin:lucas@ec2-18-237-74-219.us-west-2.compute.amazonaws.com:5672");
    Connection connection = factory.newConnection();
    Channel channel = connection.createChannel();
    
    if (TIPO.equals("@")){
      channel.queueDeclare(QUEUE, false, false, false, null); // NÃO ESQUECER, SENÃO NÃO CRIA A FILA, CASO ELA NÃO EXISTA
    } 
    
    Consumer consumer = new DefaultConsumer(channel) { //declara o processo de consumo/ recebimento das mensagens
      public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)throws IOException {
          String message = new String(body, "UTF-8");
          System.out.println("\n"+message);
          System.out.print(TIPO+QUEUE+">> ");
      }
    };
    
    channel.basicConsume(USER, true, consumer); //inicia o processo de recebimento
    
    System.out.print(TIPO+QUEUE+">> ");
    Scanner msg = new Scanner(System.in);
    String message = msg.nextLine();
    
    try{
      if (message.equals("exit")){ //se escrever exit ele finaliza
        channel.close();
        connection.close();
        //messenger.close();
        return false;
      
      } else if (message.indexOf("@") == 0){ //mudar de destinatário / fila
        TIPO = "@";
        QUEUE = message.replace("@", "");
        
      } else if (message.indexOf("#") == 0){ //mudar de destinatário / fila
        TIPO = "#";
        QUEUE = message.replace("#", "");
        
      } else if (message.indexOf("!") == 0){ // gerenciar grupo
        
        if (message.indexOf("addGroup") == 1){ //cria grupo caso não exista
          String comando[] = message.trim().split(" ");
          channel.exchangeDeclare(comando[1], "fanout");
          TIPO = "#";
          QUEUE = comando[1];
        } else if (message.indexOf("addUser") == 1){ //adiciona usuário ao grupo
          String comando[] = message.trim().split(" ");
          channel.queueBind(comando[1], comando[2], "");
        } else if (message.indexOf("delFromGroup") == 1){ //deleta usuário do grupo | !delFromGroup user group
          String comando[] = message.trim().split(" ");
          channel.queueUnbind(comando[1], comando[2], "");
        } else if (message.indexOf("removeGroup") == 1){ //deleta grupo
          String comando[] = message.trim().split(" ");
          channel.exchangeDelete(comando[1]);
        }
        
      } else { //senao segue o baile
        
        if (TIPO.equals("@")){ //mensagem para usuário
          String editedMsg = ("(DD/MM/AAAA às HH:MM:SS) " +USER + " diz: " + message);
          channel.queueDeclare(QUEUE, false, false, false, null);
          channel.basicPublish("", QUEUE, null, editedMsg.getBytes("UTF-8"));
        } else if (TIPO.equals("#")){ //mensagem para grupo
          String editedMsg = ("(DD/MM/AAAA às HH:MM:SS) " +USER+" #"+QUEUE+" diz: " + message);
          channel.basicPublish(QUEUE, "", null, editedMsg.getBytes("UTF-8"));
        }
      }
    }catch (ArrayIndexOutOfBoundsException ex){
      System.out.println("\n##### Erro! Verifique a falta de algum dado a ser informado #####");
    }
    
    channel.basicConsume(USER, true, consumer); //inicia o processo de recebimento
    
    channel.close();
    connection.close();
    
    return true; //continua execução
  }
}
