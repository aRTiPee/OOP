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
public class polRALabExer128 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            String x = JOptionPane.showInputDialog("Exercise 28\n\n"
                    + "Enter start: ");
            a = Integer.parseInt(x);
            String y = JOptionPane.showInputDialog("Enter end: ");
            b = Integer.parseInt(y);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (b < a)
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
        else {
            
            for (int m = a; m < b-1; m++) {
                System.out.println(m+1);
            }
        }
    }
}
