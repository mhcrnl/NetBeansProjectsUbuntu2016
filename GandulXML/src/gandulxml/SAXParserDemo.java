/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gandulxml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author mhcrnl
 */
public class SAXParserDemo {
    public static void main(String[] args) {
        String content ="<?xml version=\"1.0\"?>\n" +
"<class>\n" +
"   <student rollno=\"393\">\n" +
"      <firstname>dinkar</firstname>\n" +
"      <lastname>kad</lastname>\n" +
"      <nickname>dinkar</nickname>\n" +
"      <marks>85</marks>\n" +
"   </student>\n" +
"   <student rollno=\"493\">\n" +
"      <firstname>Vaneet</firstname>\n" +
"      <lastname>Gupta</lastname>\n" +
"      <nickname>vinni</nickname>\n" +
"      <marks>95</marks>\n" +
"   </student>\n" +
"   <student rollno=\"593\">\n" +
"      <firstname>jasvir</firstname>\n" +
"      <lastname>singn</lastname>\n" +
"      <nickname>jazz</nickname>\n" +
"      <marks>90</marks>\n" +
"   </student>\n" +
"</class>";
//        JFileChooser c = new JFileChooser();
//        c.showSaveDialog(c);
//        File writeFile = c.getSelectedFile();
        try{ 
//            FileWriter fw = new FileWriter(writeFile);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.append(content);
//            bw.close();
//            fw.close();
            File readFile = new File("/home/mhcrnl/Desktop/index.txt");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler = new UserHandler();
            saxParser.parse(readFile, userhandler);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class UserHandler extends DefaultHandler {
    boolean bFirstName = false;
    boolean bLastName = false;
    boolean bNickName = false;
    boolean bMarks = false;
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes 
            attributes) throws SAXException {
        if(qName.equalsIgnoreCase("student")){
            String rollNo = attributes.getValue("rollno");
            System.out.println("Roll No: "+rollNo);
        } else if(qName.equalsIgnoreCase("firstname")) {
            bFirstName = true;
        } else if(qName.equalsIgnoreCase("lastname")){
            bLastName = true;
        } else if(qName.equalsIgnoreCase("nickname")){
            bNickName = true;
        } else if(qName.equalsIgnoreCase("marks")){
            bMarks = true;
        }
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if(qName.equalsIgnoreCase("student")){
            System.out.println("End element: " +qName);
        }
    }
    
    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        if(bFirstName){
            System.out.println("First Name:" + new String(ch, start, length));
            bFirstName = false;
        } else if(bLastName) {
            System.out.println("Last Name "+ new String(ch, start, length));
            bLastName = false;
        } else if(bNickName) {
            System.out.println("Nick Name "+ new String(ch, start, length));
            bNickName = false;
        } else if(bMarks) {
            System.out.println("Marks: "+ new String(ch, start, length));
            bMarks = false;
        }
    }
}