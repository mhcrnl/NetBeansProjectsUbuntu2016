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
public class JournalOfFinancialStability {
    
    public static void main(String[] args) {
        String text2 = JFS("http://rss.sciencedirect.com/publication/science/15723089");
        //if(elements.text()!=null)
        System.out.println(text2);
    }
    
    public static String JFS(String url){
        String date = null;
        Elements elements = null;
        try {
            Document doc = Jsoup.connect(url).get();
            elements = doc.getElementsByTag("title");
            for(Element element: elements ){
                //if(element.text()!=null)
                date = element.text();
                
                System.out.println("TITLU: " + element.text()+"\n");
            }
            System.out.println(doc.title()+"\n"+doc.getElementsByTag("title")+
                    doc.getElementsByTag("br"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        //for(Element element: elements)
        return (elements.text()+"\n");
    }
    
}
