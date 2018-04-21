/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamailtest;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
/**
 *
 * @author mhcrnl
 */
public class JavaMailTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String to ="mhcrnl@yahoo.com";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("mhcrnl@gmail.com", "db24corn");
            }
        } );
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("mhcrnl@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Salut!");
            message.setText("Testarea aplicatiei JavaTestMail");
            Transport.send(message);
            System.out.println("Mesajul a fost expediat.....");
        }catch(MessagingException e){ throw new RuntimeException (e);}
    }
    
}
