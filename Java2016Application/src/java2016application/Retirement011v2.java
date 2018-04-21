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
public class Retirement011v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        System.out.print("Cu cati bani ve-ti contribui in fiecare an? :> ");
        double payment = in.nextDouble();
        System.out.print("Dobanda este de % :> ");
        double interestRate = in.nextDouble();
        double balance = 0;
        int year =0;
        String input;
        do {
            balance+=payment;
            double interest = balance*interestRate / 100;
            balance += interest;
            year++;
            System.out.printf("Dupa anul %d, veti avea %, 2f%n", year, balance);
            System.out.print("Sunte-ti gata de pensionare? Y/N :> ");
            input = in.next();
        }
        while(input.equals("N"));
    }
    
}
