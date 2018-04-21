/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slogan;

/**
 *
 * @author mhcrnl
 */
public class SloganTest {
    public static void main(String[] args) {
        Slogan obj;
        
        obj = new Slogan("Ale Ale PSD");
        System.out.println(obj);
        
        obj = new Slogan("Pnl mai rapid");
        System.out.println(obj);
        
        System.out.println("Sloganuri create: " +Slogan.getCount()+" sau ");
    }
}
