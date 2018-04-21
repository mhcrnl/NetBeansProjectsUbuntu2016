/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author mhcrnl
 */
public class AgendaMainV01 {
    AgendaWindow aw = new AgendaWindow();
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Agenda personala");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AgendaWindow aw = new AgendaWindow();
        String file = "Agendafile01.txt";
        String nume = null, prenume = null, telefon = null, email = null;
        PersoanaV01 pers = new PersoanaV01(nume, prenume, telefon, email);
        
        ArrayList<PersoanaV01> listPers = new ArrayList<PersoanaV01>(100);
        
        aw.adaugare.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = 0;
                index = Integer.parseInt(aw.nrId.getText());
                pers.setNume(aw.nume.getText());
                pers.setPrenume(aw.prenume.getText());
                pers.setTelefon(aw.telefon.getText());
                pers.setEmail(aw.email.getText());
                
                listPers.add(index, pers);
               
                //pers = new PersoanaV01(nume, prenume, telefon, email);
                System.out.println("Persoana: "+ pers.toString());
                System.out.println("LISTA: " + listPers.get(index));
                aw.setTextField();
            }
            
        });
        
        aw.salvare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 BtSalvare bts = new BtSalvare();
                 bts.salvare(file, listPers);
            }
            
        });
        
        frame.getContentPane().add(aw);
        frame.pack();
        frame.setVisible(true);
    }
    
//    public void setTextField() {
//        aw.nume.setText("");
//        aw.prenume.setText("");
//        aw.telefon.setText("");
//        aw.email.setText("");
//    }
}
