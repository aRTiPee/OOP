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
public class polRALabExer110 {
    public static void main(String[] args) {
        
        Double q = 0.0;
        Double w = 0.0;
        Double a = 0.0;
        
        
        
        try {
            String input1 = JOptionPane.showInputDialog("Exercise 10\n\n"
                + "Enter cost per kilowatt-hour in cents: ");
            q = Double.parseDouble (input1);
            String input2 = JOptionPane.showInputDialog("Exercise 10\n\n"
                + "Enter kilowatt-hours used per year: ");
            w = Double.parseDouble (input2);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        a = q * w * 0.01;
        JOptionPane.showMessageDialog(null, "Annual Cost: " + a);
    }
}
