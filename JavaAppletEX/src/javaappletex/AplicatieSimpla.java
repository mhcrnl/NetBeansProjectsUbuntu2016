/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappletex;

import java.awt.Frame;
import java.awt.Label;

/**
 *
 * @author mhcrnl
 */
public class AplicatieSimpla extends Frame{
    public AplicatieSimpla(){
        super("Aplicatie Java awt");
        addWindowListener(new FereastraAscultator());
        setBounds(100,50, 200,100);
        Label eticheta = new Label("Prima aplicatie de sine statatoare.");
        add(eticheta);
    }
    public static void main(String[] args) {
        AplicatieSimpla as = new AplicatieSimpla();
        as.setVisible(true);
    }
}
