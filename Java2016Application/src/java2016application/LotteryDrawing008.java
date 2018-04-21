/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2016application;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class LotteryDrawing008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Cate numere doriti in extragere? :>");
        int k = in.nextInt();
        System.out.print("Care doriți sa fie numarul maxim? :>");
        int n = in.nextInt();
        int[]numbers = new int[n];
        for(int i=0; i<numbers.length; i++)
            numbers[i] = i+1;
        //extragerea numerelor si punerea lor intr-un array
        int[] result = new int[k];
        for(int i=0;i<result.length; i++){
            int r =(int) (Math.random()*n);
            result[i] = numbers[r];
            numbers[r]=numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Pariati pe numerele urmatoare si ve-ti fi bogat!");
        for(int r:result)
            System.out.println(r);
        
    }
    
}
