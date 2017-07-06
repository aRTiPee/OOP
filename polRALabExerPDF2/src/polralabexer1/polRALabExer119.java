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
public class polRALabExer119 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        
        try {
            String q = JOptionPane.showInputDialog("Exercise 19\n\nYear of Birth: ");
            x = Integer.parseInt(q);
            if (x < 0 || x >99 || q.length() != 2) {
                JOptionPane.showMessageDialog(null, "Invalid Input.", 
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            String w = JOptionPane.showInputDialog("Current year: ");
            y = Integer.parseInt(w);
            if (y < 0 || y >99 || w.length() != 2) {
                JOptionPane.showMessageDialog(null, "Invalid Input.", 
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Input.", 
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (x > y) 
            y += 100;
        else if ( x == y) {
            JOptionPane.showMessageDialog(null, "Invalid Input.", 
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        z = y - x;
        JOptionPane.showMessageDialog(null, "Your age: " + z);
    }
}
