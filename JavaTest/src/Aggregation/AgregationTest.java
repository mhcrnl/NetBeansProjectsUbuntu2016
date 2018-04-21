/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

/**
 *
 * @author mhcrnl
 */
public class AgregationTest {
    public static void main(String[] args) {
        Address acasa = new Address("Prevederii 23", "Bucuresti", "Romania", 19021);
        System.out.println("Adresa: " + acasa.toString());
        Address scoala = new Address("Prevedarii 100", "Tecuci", "Ro", 234566);
        System.out.println("Adresa scolii: " + scoala.toString());
        
        
        Student std = new Student("Mihai", "Cornel", acasa, scoala);
        System.out.println("Stundent: " + std.toString());
        
        System.out.println("Instante Address: " + Address.getCount() + 
                " Instante Student: " + Student.getCount() );
        
    }
}
