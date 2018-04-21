/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfsrsstomail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author mhcrnl
 */
public class JFSRssToMail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "http://rss.sciencedirect.com/publication/science/15723089";
        String textMesaj = "";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements elements = doc.getElementsByTag("title");
            Elements pubDate = doc.getElementsByTag("pubDate");
            for(Element element: elements){
                String addArt = element.text();
                textMesaj += "DATA: "+pubDate.text()+" TITLU: "+ addArt +" AUTORI: " +"\n"; 
                System.out.println("Titlu: "+ addArt );
            }
        } catch (Exception e) { 
            e.printStackTrace();
        }
        String to = "racarui@gmail.com";
        String to1 = "mhcrnl@gmail.com";
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
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to1));
            message.setSubject("Salut! Articole din: Journal of Financial Stability ");
            message.setText(textMesaj);
            //message.addBCC;
            Transport.send(message);
            System.out.println("Mesajul a fost expediat.....");
        }catch(MessagingException e){ throw new RuntimeException (e);}
    }
    
}
