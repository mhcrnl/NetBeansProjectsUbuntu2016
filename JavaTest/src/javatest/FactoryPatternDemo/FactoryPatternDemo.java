/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.FactoryPatternDemo;

/**
 *
 * @author mhcrnl
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        FactoryGenerator fg = new FactoryGenerator();
        Adunare calculAdunare = (Adunare) fg.getGenerator("adunare");
        calculAdunare.afiseaza();
        double a = 34, b=45.89, rezultat;
        System.out.println(calculAdunare.adunare(a, b));
        int add = calculAdunare.adunareNumere(0, 0);
        System.out.println("adunareNumere: "+ add);
    }
    
}
