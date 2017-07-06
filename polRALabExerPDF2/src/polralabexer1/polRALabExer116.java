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
public class polRALabExer116 {
    public static void main(String[] args) {
        
        double d = 0;
        double c = 0;
        double b = 0;
        double a = 0;
        
        try {
            String input1 = JOptionPane.showInputDialog("Exercise 16\n\n"
                    + "Safe to proceed in 200 miles?\n\nTank capacity(gallons): ");
            a = Double.parseDouble(input1);
            String input2 = JOptionPane.showInputDialog("Gauge reading(%): ");
            b = Double.parseDouble(input2);
            if (b < 0 || b > 100) {
                JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            b *= 0.01;
            String input3 = JOptionPane.showInputDialog("Miles per Gallon: ");
            c = Double.parseDouble(input3);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        d = b*a;
        d *= c;
        if (d > 199)
            JOptionPane.showMessageDialog(null, "Safe to Proceed");
        else
            JOptionPane.showMessageDialog(null, "Get Gas!");
    }
}
