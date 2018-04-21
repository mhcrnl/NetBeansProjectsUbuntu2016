/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectiitestex;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author mhcrnl
 */
public class FilePathEx3 {
    public static void main(String[] args) {
        try {
            String filename = "text3.txt";
            String workingDirectory = System.getProperty("user.dir");
            String absoluteFilePath = "";
            String yourOS = System.clearProperty("os.name").toLowerCase();
            if(yourOS.indexOf("win")>=0){
                absoluteFilePath= workingDirectory +"\\"+filename;
            }else if(yourOS.indexOf("nix")>=0 ||
                    yourOS.indexOf("nux")>=0 ||
                    yourOS.indexOf("mac")>=0){
                absoluteFilePath= workingDirectory +"/"+filename;
            }else {
                absoluteFilePath= workingDirectory +"/"+filename;
            }
            System.out.println("Calea catre fila: "+ absoluteFilePath);
            File file = new File(absoluteFilePath);
            if(file.createNewFile()){
                System.out.println("Fila a fost creata.");
            } else {
                System.out.println("Fila exista deja.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
