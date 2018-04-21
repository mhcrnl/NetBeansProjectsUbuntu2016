/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.FactoryPatternDemo;

import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class Adunare implements Calcul{

    @Override
    public void afiseaza() {
        //To change body of generated methods, choose Tools | Templates.
        System.out.println("Clasa Adunare.");
    }
    
    public double adunare(double a, double b){
        double rezultat = a + b;
        return rezultat;
    }
    
    public int adunareNumere(int a, int b){
        int rezultat;
        System.out.println("Introducet numerele pt. adunare: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        rezultat = a+b;
        return rezultat;
    }
    
}
