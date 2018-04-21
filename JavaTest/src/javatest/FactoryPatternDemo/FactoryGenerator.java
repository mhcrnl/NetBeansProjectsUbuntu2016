/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest.FactoryPatternDemo;

/**
 *
 * @author mhcrnl
 */
public class FactoryGenerator {
    public Calcul getGenerator(String calculType){
        if(calculType == null){
            return null;
        }
        if(calculType.equalsIgnoreCase("Adunare")){
            return new Adunare();
        }
        return null;
    }
    
}
