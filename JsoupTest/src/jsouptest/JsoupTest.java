/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsouptest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author mhcrnl
 */
public class JsoupTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "http://www.bnr.ro/RSS_200003_EUR.aspx";
        try {
            Document doc= Jsoup.connect(url).get();
            String title = " ";
            //String body = doc.body().text();
            Elements elements = doc.getElementsByTag("title");
            for(Element element: elements){
                System.out.println(element.text()); 
                System.out.println(element.text().substring(7,15)+" > "+
                                   element.text().substring(19,26)+
                        element.text().trim());
            }
            
            //System.out.println(doc.title()+"\n"+doc.getElementsByTag("title").text());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
