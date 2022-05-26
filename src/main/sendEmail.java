package main;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.PreparedStatement;
import java.util.Properties;

public class sendEmail {
    public static void sendmail(String recepient) throws  Exception{
        System.out.println("preparing to send message");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        String myAccount = "xpharoh@gmail.com";
        String myPassword = "";

        Session session = Session.getInstance(properties, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccount, myPassword);
            }
        });

        Message message = prepareMessage(session , myAccount , recepient );
        Transport.send(message);
        System.out.println("Message SENT");
    }
    private static Message prepareMessage(Session session , String myAccount , String recepient ){
        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(myAccount));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient) );
            message.setSubject("Be Carefull VIRUS!");
            message.setText("Your data has been compromised ");
            return  message;
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return  null;
    }
    }