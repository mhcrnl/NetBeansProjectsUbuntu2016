/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectiitestex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mhcrnl
 */
public class WriteFileEx {
    public static void main(String[] args) {
        FileOutputStream fop = null;
        File file;
        String content = "Acesta este un text dintr-un program java";
        try {
            file = new File("text2.txt");
            fop = new FileOutputStream(file);
            if(!file.exists()){
                file.createNewFile();
            }
            byte[] contentIntBytes = content.getBytes();
            fop.write(contentIntBytes);
            fop.flush();
            fop.close();
            System.out.println("Fila a fost creata.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fop != null){
                    fop.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
