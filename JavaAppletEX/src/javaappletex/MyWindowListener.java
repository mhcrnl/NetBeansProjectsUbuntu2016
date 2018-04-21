/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappletex;

import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author mhcrnl
 */
class MyWindowListener extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        Window win = e.getWindow();
        win.dispose();
    }
    
}
