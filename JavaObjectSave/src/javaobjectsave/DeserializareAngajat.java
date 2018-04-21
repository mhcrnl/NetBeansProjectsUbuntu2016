/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjectsave;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author mhcrnl
 */
public class DeserializareAngajat {
    public static void main(String[] args) {
        Angajat a = null;
        try {
            FileInputStream fis = new FileInputStream("angajat.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a = (Angajat) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException c){
            System.out.println("Clasa Angajat nu a fost Gasita!");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserializarea clasei Angajat!");
        System.out.println("Nume angajat: "+a.nume);
        System.out.println("Adresa angajat: " +a.adresa);
        System.out.println("ID angajat: " +a.ID);
        System.out.println("Numar angajat: "+a.numar);
 
    }
}
