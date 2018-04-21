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

import java.util.*;
public class ImputTest004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce-ti numele dvs : ");
        String nume = in.nextLine();
        
        System.out.print("Introduce-ti varsta : ");
        int varsta = in.nextInt();
        
        System.out.println("\nSalut "+nume+". La anul ve-ti implini "+(varsta+1)+" ani.");
    }
    
}
