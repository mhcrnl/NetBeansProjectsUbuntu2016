/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gandulxml;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.jsoup.Jsoup;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//import org.jsoup.nodes.Document;

/**
 *
 * @author mhcrnl
 */
public class GandulXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        zfRSS("http://www.zf.ro/rss/banci-si-asigurari/");
        try {
            File inputFile = new File("gandul.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root Element: "+doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("item");
            System.out.println("-----------------------------------");
            for(int temp=0; temp<nList.getLength(); temp++){
                Node nNode = nList.item(temp);
                System.out.println("\nElementul curent: "+nNode.getNodeName());
                if(nNode.getNodeType()== Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    //System.out.println("TITLU: "+eElement.getAttribute("title"));
                    System.out.println("Titlu: "
                            + eElement
                            .getElementsByTagName("title")
                            .item(0)
                            .getTextContent());
                    System.out.println("Descriere: "
                            + eElement
                            .getElementsByTagName("link")
                            .item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void zfRSS(String url) throws IOException{
        org.jsoup.nodes.Document doc;
        doc = Jsoup.connect(url).get();
        String title = doc.title();
        System.out.println("ZfRss: " +title);
    }
    
}
