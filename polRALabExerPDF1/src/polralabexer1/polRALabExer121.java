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
public class polRALabExer121 {
    public static void main(String[] args) {
        double Tair = 0;
        double Tsteam = 0;
        double eff = 1;
        
        try {
            String a = JOptionPane.showInputDialog("Exercise 21\n\n"
                    + "Air temperature (degree Kelvin): ");
            Tair = Double.parseDouble(a);
            if (Tair < 0) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            String b = JOptionPane.showInputDialog("Exercise 21\n\n"
                    + "Steam temperature (degree Kelvin): ");
            Tsteam = Double.parseDouble(b);
            if (Tsteam < 373) {
                eff = 0;
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (eff == 0)
            JOptionPane.showMessageDialog(null, "Efficiency: 0");
        else {
            eff = 1 - (Tair/Tsteam);
            JOptionPane.showMessageDialog(null, "Efficiency: " + eff);
        }
    }
}
