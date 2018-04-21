/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colectiitestex;

/**
 *
 * @author mhcrnl
 */
public class ColectiiTestEx {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        char[] charValues = {'S', 'a', 'l', 'u', 't'};
        int charLungime;
        charLungime = charValues.length;
        System.out.println(charLungime);
        
        int[] intValues = new int[10];
        for(int i=0; i<intValues.length; i++){
            intValues[i]= i+1;
            System.out.println(intValues[i]);
        }//sau
        for(int value:intValues){
            System.out.println(value);
        }
        
    }
    
}
