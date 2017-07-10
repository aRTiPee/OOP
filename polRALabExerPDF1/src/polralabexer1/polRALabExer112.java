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
public class polRALabExer112 {
    public static void main(String[] args) {
        double log = 0;
        double answer = 0;
        
        try {
            String input = JOptionPane.showInputDialog("Exercise 12\n\n"
                + "Enter a double: ");
            log = Double.parseDouble (input);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        answer = Math.log(log)/Math.log(2);
        JOptionPane.showMessageDialog(null, "Base 2 log of " + log + " is " + 
                answer + ".");
    }
}
