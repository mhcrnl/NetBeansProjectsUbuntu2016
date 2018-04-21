/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2016application.PackageTest013;

/**
 *
 * @author mhcrnl
 */
public class PackageTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Angajat cornel = new Angajat("mihai cornel", 5000, 1989, 10, 4);
        cornel.cresteSalariu(15);
        System.out.println("Nume="+cornel.getNume()+", salariu="+cornel.getSalariu()+
                " Data angajarii="+cornel.getDataAngajari());
    }
    
}
