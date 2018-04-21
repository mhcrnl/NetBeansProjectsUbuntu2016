/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2016application;

/**
 *run:
Bine a-ti venit
Aici gasiti cod java
Va urez o zi buna!
BUILD SUCCESSFUL (total time: 6 seconds)

 * @author mhcrnl
 * mhcrnl@gmail.com
 */
public class JavaProgram002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] felicitari = new String[3];
        felicitari[0]="Bine a-ti venit";
        felicitari[1]= "Aici gasiti cod java";
        felicitari[2]="Va urez o zi buna!";
        
        for (String f: felicitari)
            System.out.println(f);
    }
    
}
