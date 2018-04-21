/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectiitestex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mhcrnl
 */
public class BufferedReaderExJDK7 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
          String sCurrentLine;
          while((sCurrentLine = br.readLine()) != null){
              System.out.println(sCurrentLine);
          }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
