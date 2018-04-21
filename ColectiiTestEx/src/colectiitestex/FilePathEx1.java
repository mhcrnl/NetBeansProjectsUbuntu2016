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
public class FilePathEx1 {
    public static void main(String[] args) {
        try{
            String filename = "text.txt";
            String workingDirectory = System.getProperty("user.dir");
            String absoluteFilePath = workingDirectory+File.separator+filename;
            File file = new File(absoluteFilePath);
            if(file.createNewFile()){
                System.out.println("Fila "+file+" a fost creata.");
            }else{
                System.out.println("File "+file+" exista.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
