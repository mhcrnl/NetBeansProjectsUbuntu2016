/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2016application.PackageTest013;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author mhcrnl
 */
public class Angajat {
    private String nume;
    private double salariu;
    private Date dataAngajari;
    
    public Angajat(String n, double s, int an, int luna, int zi){
        nume=n;
        salariu = s;
        GregorianCalendar calendar = new GregorianCalendar(an, luna-1, zi);
        dataAngajari = calendar.getTime();
    }

    public void cresteSalariu(double procente){
        double crestere = salariu *procente / 100;
        salariu+=crestere;
    }
    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @return the salariu
     */
    public double getSalariu() {
        return salariu;
    }

    /**
     * @return the dataAngajari
     */
    public Date getDataAngajari() {
        return dataAngajari;
    }
    
    
}
