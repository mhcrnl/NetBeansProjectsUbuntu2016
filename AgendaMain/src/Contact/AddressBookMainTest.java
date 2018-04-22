/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhcrnl
 */
public class AddressBookMainTest {
    
    private Contact c1, c2, c3, c4, c5, c6, c7;
    List<Contact> contactList = new ArrayList<Contact>();
    
    private void createNewContacts() {
        c1 = new Contact("Mihai","0722270796");
        c2 = new Contact("Cornel","0722270796");
        c3 = new Contact("Irina","0722270796");
        c4 = new Contact("zoro","0722270796");
        c5 = new Contact("Albano","0722270796");
        c6 = new Contact("dan","0722270796");
        c7 = new Contact("Radu","0722270796");
    }
    
    public List listaContacte() {
        createNewContacts();
        contactList.add(c1);
        contactList.add(c2);
        return contactList;
        }
    }
    
    
    public static void main (String[] args) {
   
         Contact con = new Contact();
        

        
    }
    
}
