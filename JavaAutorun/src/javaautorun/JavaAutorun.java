/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaautorun;

import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author mhcrnl
 */
public class JavaAutorun extends TimerTask {
    Date now;
    /**
     * @param args the command line arguments
     */
    public void run() {
        // TODO code application logic here
        now = new Date();
        System.out.println("Time is: "+now);
    }
    
}
