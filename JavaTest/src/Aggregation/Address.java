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
public class Address {
    private String strada, oras, tara;
    private long codPostal;
    private static int count = 0;
    
    public Address(String strada, String oras, String tara, long codPostal){
       this.strada = strada;
       this.oras = oras;
       this.tara = tara;
       this.codPostal = codPostal;
       count++;
    }
    
    public static int getCount(){
        return count;
    }
    
    @Override
    public String toString(){
        String rezultat;
        rezultat = strada +"\n";
        rezultat += oras +"," +tara +" "+codPostal;
        return rezultat;
    }
}
