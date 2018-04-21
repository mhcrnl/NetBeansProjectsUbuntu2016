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
public class LotteryOdds009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Cate numere veti la extragere? :>");
        int k = in.nextInt();
        System.out.print("Care este cel mai mare numar din extrager? :>");
        int n = in.nextInt();
        
        int lotteryOdds =1;
        for (int i=0; i<=k; i++)
            lotteryOdds= lotteryOdds *(n-i+1);
        System.out.println("\nNumarul este " +lotteryOdds+" . Noroc!");
    }
    
}
