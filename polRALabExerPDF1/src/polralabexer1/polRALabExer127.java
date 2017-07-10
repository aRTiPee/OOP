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
public class polRALabExer127 {
    public static void main(String[] args) {
        int rf = 0;
        int lf = 0;
        int rr = 0;
        int lr = 0;
        int m = 0;
        int n = 0;
        int counter = 0;
        try {
            String rfS = JOptionPane.showInputDialog("Exercise 27\n\n"
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
        for (int front = (rf-3); front < (rf+4); front++){
            if (front == lf)
                m++;
        }
        for (int rear = (rr-3); rear < (rr+4); rear++){
            if (rear == lr)
                n++;
        }
        if (m == 0 || n == 0)
            JOptionPane.showMessageDialog(null, "Inflation is NOT OK");
        else {
            if (counter > 0)
                JOptionPane.showMessageDialog(null, "Inflation is NOT OK");
            else 
                JOptionPane.showMessageDialog(null, "Inflation is OK");
        }
    }
    /*public static void solve(int rf, int lf, int rr, int lr) {
        int m = 0;
        int n = 0;
        
        try {
            String q = JOptionPane.showInputDialog("Input right front pressure: ");
            String w = JOptionPane.showInputDialog("Input left front pressure: ");
            String e = JOptionPane.showInputDialog("Input right rear pressure: ");
            String r = JOptionPane.showInputDialog("Input left rear pressure: ");
            rf = Integer.parseInt(q);
            lf = Integer.parseInt(w);
            rr = Integer.parseInt(e);
            lr = Integer.parseInt(r);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        for (int front = (rf-3); front < (rf+4); front++){
            if (front == lf)
                m++;
        }
        
        for (int rear = (rr-3); rear < (rr+4); rear++){
            if (rear == lr)
                n++;
        }
        
        
        if (m != 0 && n != 0)
            System.out.println("CORRECT");
        else 
            System.out.println("WRONG");
    }
    public static void main(String[] args) {
        int rf = 0;
        int lf = 0;
        int rr = 0;
        int lr = 0;
        
        solve (rf, lf, rr, lr);
    }*/
    
}
