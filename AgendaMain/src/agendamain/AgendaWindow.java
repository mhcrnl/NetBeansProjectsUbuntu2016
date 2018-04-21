/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamain;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * AgendaWindow.java
 * @author mhcrnl@gmail.com     0722270796
 * Fereastra cu manager de layout GridLayout.
 */
public class AgendaWindow extends JPanel {
    
    public JButton adaugare, salvare, cautare, stergere, inchidere;
    public JTextField nrId, nume, prenume, telefon, email;
    public AgendaWindow() {
        
        setLayout(new GridLayout(5,3));
        setBackground(Color.CYAN);
        /**
         * Crearea butoanelor din interfata grafica
         */
        adaugare = new  JButton("ADAUGARE");
        salvare = new  JButton("SALVARE");
        //salvare.addActionListener(new BtSalvare());
        
        cautare = new  JButton("CAUTARE");
        stergere = new  JButton("STERGERE");
        inchidere = new  JButton("INCHIDERE");
        /**
         * crearea etichetelor GUI
         */
        JLabel nrIdL      = new JLabel("  NR.ID  : ");
        JLabel numeL      = new JLabel("  NUME   : ");
        JLabel prenumeL   = new JLabel("  PRENUME: ");
        JLabel telefonL   = new JLabel("  TELEFON: ");
        JLabel emailL     = new JLabel("  EMAIL  : ");
        /**
         * Crearea text field-ului
         */
        nrId = new JTextField();
        nume = new JTextField();
        prenume = new JTextField();
        telefon = new JTextField();
        email = new JTextField(20);
        /**
         * Afisarea sirurilor de componente in fereastra dupa row/coloane
         */
        add(adaugare);  add(nrIdL);     add(nrId);
        add(salvare);   add(numeL);     add(nume);
        add(cautare);   add(prenumeL);  add(prenume);
        add(stergere);  add(telefonL);  add(telefon);
        add(inchidere); add(emailL);    add(email);
        
        inchidere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        
        
    }
    
    public void setTextField() {
        nrId.setText("");
        nume.setText("");
        prenume.setText("");
        telefon.setText("");
        email.setText("");
    }
}
