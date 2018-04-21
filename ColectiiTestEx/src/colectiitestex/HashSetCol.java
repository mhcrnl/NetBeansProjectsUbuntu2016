/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectiitestex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author mhcrnl
 */
public class HashSetCol {
    
    
    
    public static void main(String[] args) {
        List<String> lite = new ArrayList<String>();
        lite.add("Vasile");
        lite.add("Andrei");
        lite.add("Cornel");
        lite.add("Vasile");
        lite.add("Claudiu");
        lite.add("Claudiu");
        System.out.println(lite);
        Collection<String> faraDup = new HashSet<String>(lite);
        System.out.println(faraDup +"\nHashSet size: "+ faraDup.size());
        
    }
    
    
    
}
