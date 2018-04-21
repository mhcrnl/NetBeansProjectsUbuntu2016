/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author mhcrnl
 */
public class Contact implements Serializable, Comparator<Contact>{
    
    private static final long versiune = 1L;
    
    private String nume, telefon;
    
    public Contact(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
    }

    @Override
    public int compare(Contact contact1, Contact contact2) {
       return contact1.getNume().compareToIgnoreCase(contact2.getNume());
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
    
    @Override
    public String toString() {
        return nume + " " +telefon;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nume);
        hash = 59 * hash + Objects.hashCode(this.telefon);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Contact) {
            Contact contact = (Contact) obj;
            return nume.equals(contact.getNume()) && telefon.equals(contact.getTelefon());
        }
        return false;
    }
}
