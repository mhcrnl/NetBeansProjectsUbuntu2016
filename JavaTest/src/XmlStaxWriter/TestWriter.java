/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlStaxWriter;

/**
 *
 * @author mhcrnl
 */
public class TestWriter {
    public static void main(String[] args) {
        StaxWriter configFile = new StaxWriter();
        configFile.setFile("config2.xml");
        try {
            configFile.saveConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
