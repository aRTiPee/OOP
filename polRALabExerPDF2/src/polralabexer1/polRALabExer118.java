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
public class polRALabExer118 {
    public static void main(String[] args) {
        double A = 0;
        double a = 0;
        double B = 0;
        double b = 0;
        double contA = 0;
        double contB = 0;
        try {
            String p = JOptionPane.showInputDialog("Exercise 18\n\n"
                    + "Price per pound Package A: ");
            A = Double.parseDouble(p);
            String o = JOptionPane.showInputDialog("Percent lean package A: ");
            a = Double.parseDouble(o);
            String i = JOptionPane.showInputDialog("Price per pound Package B:");
            B = Double.parseDouble(i);
            String u = JOptionPane.showInputDialog("Percent lean package A: ");
            b = Double.parseDouble(u);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Input.", 
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        contA = (A/a)*100;
        contB = (B/b)*100;
        if (contB > contA) {
            JOptionPane.showMessageDialog(null, "Package A cost per pound of lean: " + contA +
                    "\n\nPackage B cost per pound of lean: " + contB +
                    "\n\nPackage A is the best value.");
        }
        else if (contB < contA) {
            JOptionPane.showMessageDialog(null, "Package A cost per pound of lean: " + contA +
                    "\n\nPackage B cost per pound of lean: " + contB +
                    "\n\nPackage B is the best value.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Package A cost per pound of lean: " + contA +
                    "\n\nPackage B cost per pound of lean: " + contB +
                    "\n\nPackage A and Package B are the same.");
        }
    }
}
