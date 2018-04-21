/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamain;

import java.io.Serializable;

/**
 * File: Persoana.java  Data: 25/04/2016 
 * 
 * @author mhcrnl
 */
public class Persoana implements Serializable{
    /**
     * Datele pe care aceasta clasa trebuie sa le retina.
     */
    private String nrId, nume, prenume, telefon, email;
    /**
     * Constructor
     */
//    public Persoana(String nrId, String nume, String prenume, 
//            String telefon,String email) {
//        this.nrId = nrId;
//        this.nume = nume;
//        this.prenume = prenume;
//        this.telefon = telefon;
//        this.email = email;
//    }
    /**
     * @return the nrId
     */
    public String getNrId() {
        return nrId;
    }

    /**
     * @param nrId the nrId to set
     */
    public void setNrId(String nrId) {
        this.nrId = nrId;
    }

    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * @return the prenume
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * @param prenume the prenume to set
     */
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString() {
        String persoana = nrId+" "+nume+" "+prenume+" "+telefon+" "+email;
        return persoana;
    }
    
}
