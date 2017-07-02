/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexerpdf2;

import javax.swing.JOptionPane;

/**
 *
 * @author artipee
 */
public class polRALabExerPDF25 {
    public static void main(String[] args) {
        double degrees = 0;
        double radians = 0;
        
        String degreesStr = JOptionPane.showInputDialog("Exercise 5\n\nConverting Degrees to "
                + "Radians\n\nEnter Degrees: ");
        
        try {
            degrees = Double.parseDouble(degreesStr);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        radians = degrees * Math.PI/180;
        
        JOptionPane.showMessageDialog(null, "Degrees: " + degreesStr +
                "\nRadians: " + radians);
    }
}

