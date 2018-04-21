/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2016application;

import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class ImputTest006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Care este numele dvs? : >");
        String nume = in.nextLine();
        System.out.print("Ce varsta aveti? : >");
        int varsta = in.nextInt();
        System.out.println("Salut, " +nume+ " Anul viitor vei implini "+ (varsta+1)+".");
    }
    
}
