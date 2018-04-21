/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjectsave;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author mhcrnl
 */
public class JavaObjectSave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Angajat a = new Angajat();
        a.nume = "Mihai Cornel";
        a.adresa = "Prevederii 23";
        a.ID = 1234;
        a.numar = 101;
        
        try {
            FileOutputStream fos = new FileOutputStream("angajat.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a);
            oos.close();
            fos.close();
            System.out.println("Obiectul a fost salvat!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
