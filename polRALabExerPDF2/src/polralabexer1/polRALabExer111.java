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
public class polRALabExer111 {
    public static void main(String[] args) {
        double g = 32.174;
        double s = 0;
        
        try {
            String input = JOptionPane.showInputDialog("Exercise 11\n\n"
                + "Enter the number of seconds: ");
            s = Double.parseDouble (input);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        double d = Math.pow(s, 2) * g / 2;
        JOptionPane.showMessageDialog(null, "Distance: " + d + " feet");
    }
}
