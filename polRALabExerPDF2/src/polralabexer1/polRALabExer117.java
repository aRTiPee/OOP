/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexer1;

import javax.swing.*;
/**
 *
 * @author artipee
 */
public class polRALabExer117 {
    public static void main(String[] args) {
        int a = 0;
        try {
            String input = JOptionPane.showInputDialog("Exercise 17\n\n"
                    + "Weight(Integer only): ");
            a = Integer.parseInt(input);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (a > 280 || a < 220)
            JOptionPane.showMessageDialog(null, "Not allowed");
        else
            JOptionPane.showMessageDialog(null, "Allowed");
    }
}
