/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjectsave;

import javax.swing.JFileChooser;

/**
 *
 * @author mhcrnl
 */
public class JFileCooserEx {
    public static void main(String[] args) {
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(jfc);
        jfc.getSelectedFile();
    }
    
}
