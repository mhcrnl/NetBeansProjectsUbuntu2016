/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2016application;

/**
 *
 * @author mhcrnl
 */
public class LotteryArray007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NMAX=10;
        int[][] odds = new int [NMAX+1][];
        for(int n=0; n<=NMAX; n++)
            odds[n] = new int[n+1];
        for(int n=0; n<odds.length; n++)
            for(int k=0; k<odds[n].length; k++){
                int lotteryOdds=1;
                for( int i=0; i<=k; i++)
                    lotteryOdds=lotteryOdds*(n-i+1);
                odds[n][k]= lotteryOdds;
            }
        for(int[]row:odds){
            for(int odd:row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
    
}
