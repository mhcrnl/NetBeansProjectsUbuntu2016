/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

/**
 *
 * @author mhcrnl
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Notepad extends JFrame {

    public Notepad() {

        initUI();
    }

    private void initUI() {
        
        createMenuBar();

        setTitle("Simple menu");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();
        //ImageIcon icon = new ImageIcon("exit.png");
        setJMenuBar(menubar);
        JMenu file = new JMenu("File");
        
        //getComponent();
        menubar.setVisible(true);
        
        
        file.setMnemonic(KeyEvent.VK_F);
        menubar.add(file);
        
        file.add(new JMenuItem("Item"));

        JMenuItem eMenuItem = new JMenuItem("Exit");
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        //eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        
        file.add(eMenuItem);

        
        //
        pack();
             
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Notepad ex = new Notepad();
                ex.setVisible(true);
            }
        });
    }
}