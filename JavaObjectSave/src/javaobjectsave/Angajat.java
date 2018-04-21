package javaobjectsave;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mhcrnl
 */
public class Angajat implements Serializable {
    public String nume;
    public String adresa;
    public transient int ID;
    public int numar;
    
    public void mailCheck(){
        System.out.println("Verficare mail "+ nume+ " "+adresa);
    }
    
}
