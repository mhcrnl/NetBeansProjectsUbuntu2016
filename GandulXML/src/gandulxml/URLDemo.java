/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gandulxml;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author mhcrnl
 */
public class URLDemo {
    
    public static String url = "http://www.tutorialspoint.com/java/java_url_processing.htm";
    
    public static void main(String[] args) {
        URLDemo urld= new URLDemo();
        urld.conURL(url);
        urld.UrlDemo1(url);
    }
    
    public void UrlDemo1(String url){
        try {
            URL url1 = new URL(url);
            System.out.println("URL este: " + url1.toString());
            System.out.println("Protocolul este: " +url1.getProtocol());
            System.out.println("Autoritatea este: " +url1.getAuthority());
            System.out.println("File: " +url1.getFile());
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    
    public void conURL(String url){
        try {
            URL url2 = new URL(url);
            URLConnection conexiuneURL = url2.openConnection();
            HttpURLConnection conexiune =(HttpURLConnection) conexiuneURL;
            BufferedReader in =new BufferedReader(new InputStreamReader(conexiune
                                .getInputStream()));
            String urlString ="", curent;
            while((curent = in.readLine())!= null){
                urlString += curent;
            }
            System.out.println("CONTINUT: " +urlString);
        } catch (Exception e) {
        }
    }
    
}
