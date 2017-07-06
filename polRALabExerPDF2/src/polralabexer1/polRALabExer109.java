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
public class polRALabExer109 {
    public static void main(String[] args) {
        Double volts = 0.0;
        Double ohms = 0.0;
        
        Double amps;
        
        String voltsS = JOptionPane.showInputDialog("Exercise 9\n\n"
                + "Enter voltage: ");
        String ohmsS = JOptionPane.showInputDialog("Exercise 9\n\n"
                + "Enter resistance: ");
        
        try {
            volts = Double.parseDouble (voltsS);
            ohms = Double.parseDouble (ohmsS);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        amps = volts/ohms;
        JOptionPane.showMessageDialog(null, "The current is " + amps + " amps");
    }
}
