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
public class polRALabExer115 {
    public static void main(String[] args) {
        int bolts = 0;
        int nuts = 0;
        int washers = 0;
        int total = 0;
        try {
            String m = JOptionPane.showInputDialog("Exercise 15\n\nNumber "
                    + "of bolts(5 cents per bolt): ");
            bolts = Integer.parseInt(m);
            String n = JOptionPane.showInputDialog("Number of nuts(3 cents per nut): ");
            nuts = Integer.parseInt(n);
            String b = JOptionPane.showInputDialog("Number of washers(1 cent for washer): ");
            washers = Integer.parseInt(b);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input!", 
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        total = (bolts*5)+(nuts*3)+(washers*1);
        if (bolts > nuts) 
            JOptionPane.showMessageDialog(null, "Check the Order\n\nTotal Cost: " + total + " cents.");
        else 
            JOptionPane.showMessageDialog(null, "Order is OK\n\nTotal Cost: " + total + " cents.");
        
    }
}
