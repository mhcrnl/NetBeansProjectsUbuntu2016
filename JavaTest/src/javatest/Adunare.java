/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 * Supraincarcarea metodelor 
 * @author mhcrnl
 */
public class Adunare {
    
    public int intregi(int a, int b){
        System.out.println("Metoda: int intregi(int a, int b)");
        int resultat = a + b;
        return resultat;
    }
    
    public double intregi(double c, int b){
        System.out.println("Metoda: double intregi(double c, int b)");
        double rezultat = c + b;
        return rezultat;
    }
    
    public double intregi(int a, double c){
        System.out.println("Metoda: double intregi(int a, double c)");
        double rezultat = a+c;
        return rezultat;
    }
    
    public double intregi(double c, double d){
        System.out.println("Metoda: double intregi(double c, double d)");
        double rezultat = c+d;
        return rezultat;
    }
    
    public static void main(String[] args) {
        Adunare adunare = new Adunare();
        int a = 56, b=22;
        System.out.println("Rezultat: "+adunare.intregi(a, b));
        double c = 23.43;
        System.out.println("Rezultat: "+adunare.intregi(c, b));
        System.out.println("Rezultat: "+adunare.intregi(a, c));
        float f1=23.4F, f2=56.4F;
        System.out.println("Metode apelate pt. float----------------------");
        System.out.println("Rezultat: "+adunare.intregi((int) f1, (int) f2));
        System.out.println("Rezultat: "+adunare.intregi((int) f1,       f2));
        System.out.println("Rezultat: "+adunare.intregi(      f1, (int) f2));
        System.out.println("Rezultat: "+adunare.intregi(      f1,       f2));
    }
}

