/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author mhcrnl
 */
public class JavaTest {
    
    public JavaTest(){
        Adunare add = new Adunare();
        int a=90, b=34;
        int resultat = add.intregi(a, b);
        System.out.println("Rezultat: "+resultat);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JavaTest jt = new JavaTest();
        
    }
    
}
