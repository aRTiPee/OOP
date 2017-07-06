/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexer1;

import javax.swing.JOptionPane;
/**
 *
 * @author artipee
 */
public class polRALabExer101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double eqn = 0.0;
        
        String input = JOptionPane.showInputDialog("Exercise 1\n\nQuadratic "
                + "equation = "
                + "3x\u00B2 - 8x + 4 --- Substitute 'x' ");
        try {
            eqn = Double.parseDouble(input);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        double q1 = eqn*eqn;
        double q2 = 3*q1;
        double q3 = 8*eqn;
        double ans = q2 - q3 + 4;
        
        JOptionPane.showMessageDialog(null, "The answer is " + ans + ".");
    }
    
}
