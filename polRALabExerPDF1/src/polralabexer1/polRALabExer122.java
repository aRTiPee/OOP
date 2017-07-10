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
public class polRALabExer122 {
    public static void main(String[] args) {
        int x = 0;
        double y = 0;
        try {
            String a = JOptionPane.showInputDialog("Exercise 22\n\n"
                    + "Number of items: ");
            x = Integer.parseInt(a);
            String b = JOptionPane.showInputDialog("Single-item heating time: ");
            y = Double.parseDouble(b);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (x == 1)
            JOptionPane.showMessageDialog(null, "Heating time: " + y + " seconds");
        else if (x == 2) {
            double m = y*0.5;
            y += m;
            JOptionPane.showMessageDialog(null, "Heating time: " + y + " seconds");
        }
        else if (x == 3) {
            double m = y*2;
            y += m;
            JOptionPane.showMessageDialog(null, "Heating time: " + y + " seconds");
        }
        else if (x > 3)
            JOptionPane.showMessageDialog(null, "Not recommended!", "Not recommended!", 
                    JOptionPane.ERROR_MESSAGE);
        else {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
