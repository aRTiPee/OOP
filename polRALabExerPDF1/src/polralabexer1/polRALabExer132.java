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
public class polRALabExer132 {
    public static void main(String[] args) {
        try {
            String inputS = JOptionPane.showInputDialog("Enter N: ");
            int input = Integer.parseInt(inputS);
            double sum = 0;
            for(int i = 1; i<=input; i++)
                sum += 1.0/i;
            JOptionPane.showMessageDialog(null, "Sum is: " + sum);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
