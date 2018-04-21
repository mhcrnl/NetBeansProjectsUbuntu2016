/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappletex;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author mhcrnl
 */
class FereastraAscultator extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        Frame fer = (Frame) e.getSource();
        fer.dispose();
    }
    
}
