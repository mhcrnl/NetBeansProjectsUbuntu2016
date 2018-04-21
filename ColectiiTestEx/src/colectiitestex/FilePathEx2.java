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
public class FilePathEx2 {
    public static void main(String[] args) {
        try{
        String filename = "text1.txt";
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory, filename);
        System.out.println("Calea catre fisier: "+file.getAbsolutePath());
        if(file.createNewFile()){
            System.out.println("Fila a fost creata.");
        }else{
            System.out.println("Fila exista deja");
        }
    }catch(IOException e){
        e.printStackTrace();
    }
        
}
    
}
