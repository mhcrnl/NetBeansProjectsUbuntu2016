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
public class FilePermisionEx {
    public static void main(String[] args) {
        try {
            File file = new File("shellscript.sh");
            if(file.exists()){
                System.out.println("Este executabila: "+ file.canExecute());
                System.out.println("Poate fi scrisa: "+file.canWrite());
                System.out.println("Poate fi citita: "+file.canRead());
            }
            file.setExecutable(false);
            file.setReadable(false);
            file.setWritable(false);
            System.out.println("Este executabila: "+ file.canExecute());
            System.out.println("Poate fi scrisa: "+file.canWrite());
            System.out.println("Poate fi citita: "+file.canRead());
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
