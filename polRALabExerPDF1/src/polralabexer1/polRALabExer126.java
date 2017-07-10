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
public class polRALabExer126 {
    public static void main(String[] args) {
        int rf = 0;
        int lf = 0;
        int rr = 0;
        int lr = 0;
        int counter = 0;
        try {
            String rfS = JOptionPane.showInputDialog("Exercise 26\n\n"
                    + "Input right front pressure: ");
            rf = Integer.parseInt(rfS);
            if (rf < 35 || rf > 45) {
                JOptionPane.showMessageDialog(null, "Warning: pressure is "
                        + "out of range");
                counter++;
            }
            String lfS = JOptionPane.showInputDialog("Input left front"
                    + " pressure: ");
            lf = Integer.parseInt(lfS);
            if (lf < 35 || lf > 45){
                JOptionPane.showMessageDialog(null, "Warning: pressure is "
                        + "out of range");
                counter++;
            }
            String rrS = JOptionPane.showInputDialog("Input right rear"
                    + " pressure: ");
            rr = Integer.parseInt(rrS);
            if (rr < 35 || rr > 45){
                JOptionPane.showMessageDialog(null, "Warning: pressure is "
                        + "out of range");
                counter++;
            }
            String lrS = JOptionPane.showInputDialog("Input left rear"
                    + " pressure: ");
            lr = Integer.parseInt(lrS);
            if (lr < 35 || lr > 45){
                JOptionPane.showMessageDialog(null, "Warning: pressure is "
                        + "out of range");
                counter++;
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (counter > 0)
            JOptionPane.showMessageDialog(null, "Inflation is NOT OK");
        else {
            if (rf == lf && rr == lr)
                JOptionPane.showMessageDialog(null, "Inflation is OK");
            else 
                JOptionPane.showMessageDialog(null, "Inflation is NOT OK");
        }
    }
}
