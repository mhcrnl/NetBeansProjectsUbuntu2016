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
public class Student {
    private String nume, prenume;
    private Address adresaAcasa, adresaScoli;
    private static int count = 0;
    
    public Student(String nume, String prenume, Address acasa, Address scoala){
        this.nume = nume;
        this.prenume = prenume;
        adresaAcasa = acasa;
        adresaScoli = scoala;
        count++;
    }
    
    public static int getCount(){
        return count;
    }
    
    @Override
    public String toString(){
        String rezultat;
        rezultat = nume + " " + prenume + "\n";
        rezultat += "Adresa de acasa: \n" + adresaAcasa + "\n";
        rezultat += "Adresa Scolii: \n" + adresaScoli;
        return rezultat;
    }
}
