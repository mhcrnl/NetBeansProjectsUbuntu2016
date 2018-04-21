/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2016application;

/**
 *
 * @author mhcrnl
 */
public class CompoundInterest012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double STARTRATE =10;
        final int NRATES=6;
        final int NYEARS =10;
        double[] interestRate = new double[NRATES];
        for(int j=0; j<interestRate.length; j++)
            interestRate[j]=(STARTRATE+j)/100;
        double[][] balances = new double[NYEARS][NRATES];
        for(int j=0; j<balances[0].length; j++)
            balances[0][j]=10000;
        
        for(int i=1; i<balances.length; i++){
            for(int j=0; j<balances[i].length; j++){
                double oldBalance= balances[i- 1][j];
                double interest = oldBalance*interestRate[j];
                balances[i][j]=oldBalance+interest;
            }
        }
         for(int j=0; j<interestRate.length; j++)
             System.out.printf("%9.0f%%", 100*interestRate[j]);
         System.out.println();
         for(double[] row: balances){
             for(double b:row)
                 System.out.printf("%10.2f", b);
             System.out.println();
         }
    }
    
}
