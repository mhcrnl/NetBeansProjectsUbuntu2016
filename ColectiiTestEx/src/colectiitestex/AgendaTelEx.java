/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectiitestex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class AgendaTelEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FileOutputStream fop = null;
        File file;
        String content = "";
        try {
            file = new File("agenda.txt");
            fop = new FileOutputStream(file);
            if(!file.exists()){
                file.createNewFile();
            }
            System.out.println("Introduce-ti numele: ");
            content = in.nextLine();
            byte[] contentInBytes = content.getBytes();
            fop.write(contentInBytes);
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
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
