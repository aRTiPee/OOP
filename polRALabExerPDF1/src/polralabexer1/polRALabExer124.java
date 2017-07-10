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
public class polRALabExer124 {
    public static void main(String[] args) {
        double check = 0;
        double savings = 0;
        double charge = 0;
        try {
            String checkS = JOptionPane.showInputDialog("Exercise 24\n\n"
                    + "Checking account: ");
            check = Double.parseDouble(checkS);
            String savingsS = JOptionPane.showInputDialog("Exercise 24\n\n"
                    + "Checking account: ");
            savings = Double.parseDouble(savingsS);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (check < 1000)
            charge += .15;
        if (savings < 1500)
            charge += .15;
        JOptionPane.showMessageDialog(null, "Service charge: $" + charge);
    }
}
