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
public class polRALabExer107 {
    public static void main(String[] args) {
        int cents = 0;
        int dollar = 0;
        
        String centsStr = JOptionPane.showInputDialog("Exercise 7\n\n"
                + "Input the cents (integer"
                + " only): ");
        try {
            cents = Integer.parseInt (centsStr);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (cents > 99) {
            dollar = cents/100;
            cents -= (dollar*100);
        }
        JOptionPane.showMessageDialog(null, "That is " + dollar + " dollars "
                + "and " + cents + " cents.");
    }
}
