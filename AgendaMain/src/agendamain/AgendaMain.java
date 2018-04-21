/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mhcrnl
 */
public class AgendaMain {

    /**
     * @param args the command line arguments
     */
    static String fileName = "Agendapersoana.txt";
    
    public void golireTextFields() {
            
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Agenda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AgendaWindow aw = new AgendaWindow();
        Persoana pers = new Persoana();
        ArrayList<Persoana> listPers = new ArrayList<Persoana>();
        /**
         * Inchiderea ferestrei prin actionarea Butonului inchidere
         */
        aw.inchidere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Inchiderea ferestrei
                System.exit(0);
            }
        });
        
        aw.adaugare.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 //To change body of generated methods, choose Tools | Templates.
                 //pers = new Persoana();
                 pers.setNrId(aw.nrId.getText());
                 pers.setNume(aw.nume.getText());
                 pers.setPrenume(aw.prenume.getText());
                 pers.setTelefon(aw.telefon.getText());
                 pers.setEmail(aw.email.getText());
//                 pers = new Persoana(aw.nrId.getText(),aw.nume.getText(),
//                                aw.prenume.getText(), aw.telefon.getText(),
//                                aw.email.getText());
                 listPers.add(pers);
                 
                 System.out.println("Persoana: " + pers.toString());
                 System.out.println("Lista: " + listPers);
                 
                 aw.nrId.setText("");
                 aw.nume.setText("");
                 aw.prenume.setText("");
                 aw.telefon.setText("");
                 aw.email.setText("");
            }
            
        });
        
        aw.salvare.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                try {
                    PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
                    for(Persoana pers : listPers)
                        pw.println(pers.toString());
                    pw.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(null,"Inregistrarea a fost adaugata.", 
                        "Salvare date!", JOptionPane.INFORMATION_MESSAGE);
            }
            
        });
        
      
    
        frame.getContentPane().add(aw);
        frame.pack();
        frame.setVisible(true);
    }
    
}
