/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gandulxml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;

/**
 *
 * @author mhcrnl
 */
public class FileChooserEx {
    public static void main(String[] args) {
        JFileChooser c = new JFileChooser();
        c.showOpenDialog(c);
        File writeFile = c.getSelectedFile();
        String content = "Aici pot fi intoduse datele pt scriere in fila";
        try {
            FileWriter fw = new FileWriter(writeFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(content);
            bw.append("hiiiiii");
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
                
    }
    
}
