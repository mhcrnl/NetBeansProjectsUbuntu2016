/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectiitestex;

import java.io.File;

/**
 *
 * @author mhcrnl
 */
public class CreateFileEx {
    public static void main(String[] args) {
        try {
            File file = new File("text.txt");
            if(file.createNewFile()){
                System.out.println("Fila "+file+" a fost creata.");
            } else {
                System.out.println("Fila "+file+" exista deja.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
