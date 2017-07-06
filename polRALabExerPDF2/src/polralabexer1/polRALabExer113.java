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
public class polRALabExer113 {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        double dMean = 0;
        double hMean = 0;
        
        try {
            String xx = JOptionPane.showInputDialog("Exercise 13\n\n"
                    + "Enter x: ");
            x = Double.parseDouble(xx);
            String yy = JOptionPane.showInputDialog("Exercise 13\n\n"
                    + "Enter y: ");
            y = Double.parseDouble(yy);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        dMean = (x+y)/2;
        double xxx = 1/x;
        double yyy = 1/y;
        double zzz = xxx + yyy;
        hMean = 2/(zzz);
        JOptionPane.showMessageDialog(null, "Arithmetic Mean: " + dMean + 
                "\nHarmonic Mean: " + hMean);
    }
}