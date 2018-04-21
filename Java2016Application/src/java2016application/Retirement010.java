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
public class Retirement010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("De cati bani ai nevoie la pensie? :>");
        double goal = in.nextDouble();
        System.out.print("Cu cati bani vei contribui in fiecare an? :>");
        double payment = in.nextDouble();
        System.out.print("Rata de crestere este de % :>");
        double interestRate = in.nextDouble();
        System.out.println();
        double balance =0;
        int years=0;
        while(balance<goal){
            balance+=payment;
            double interest = balance*interestRate/ 100;
            balance+=interest;
            years++;
        }
        System.out.println("Va puteti pensiona in "+years+ " ani.");
    }
    
}
