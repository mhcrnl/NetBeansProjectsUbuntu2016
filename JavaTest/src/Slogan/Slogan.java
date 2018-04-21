/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slogan;

/**
 * Slogan.java  
 * @author mhcrnl
 * Reprezinta o clasa care returneaza un string.
 */
public class Slogan {
    private String fraza;
    private static int count=0;
    /** 
     * Constructorul clasei care seteaza sloganul si mentine numarul de instante.
     * @param str 
     */
    public Slogan(String str){
        fraza = str;
        count++;
    }
    /**
     * Metoda returneaza sloganul ca un string
     * @return 
     */
    @Override
    public String toString(){
        return fraza;
    }
    /**
     * Returnaza numarul de instante a obiectului.
     */
    public static int getCount(){
        return count;
    }
}
