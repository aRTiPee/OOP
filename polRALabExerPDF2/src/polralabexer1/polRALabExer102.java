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
public class polRALabExer102 {
    public static void main(String[] args) {
        
        for (int m = 0; m < 3; m++)
        {
            double eqn = 0.0;
            int n = m+1;
            String input = JOptionPane.showInputDialog("Exercise 2\n\n" + n + ". Quadratic "
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
}
