/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamain;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mhcrnl
 */
public class BtSalvare {
    
    public void salvare(String file, ArrayList list){
        try (FileWriter writer = new FileWriter(file, true)) {
            int size = list.size();
            for(int i =0; i<size; i++){
                String str = list.get(i).toString();
                writer.write(str);
                if(i<size-1) writer.write("\n");
                        
            }
        } catch (IOException e) {
        } 
    }
      
}
