/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappletex;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Graphics;

/**
 *
 * @author mhcrnl
 */
public class JavaAppletEX extends Applet {

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g) {
        // TODO code application logic here
        g.drawString("Salut din applet", 25,25);
    }
    
    public static void main(String[] args) {
        JavaAppletEX app = new JavaAppletEX();
        Frame frame = new Frame("aplet in fereastra");
        frame.add(app, BorderLayout.CENTER);
        frame.setSize(200, 100);
        frame.addWindowListener(new MyWindowListener());
        app.init();
        app.start();
        frame.show();
        app.destroy();
    }
    
}
