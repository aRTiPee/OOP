/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexerpdf2;

import javax.swing.JOptionPane;
/**
 *
 * @author artipee
 */
public class polRALabExerPDF24 {
    public static void main(String[] args) {
        double sinInit = 0;
        double cosInit = 0;
        double sin = 0;
        double cos = 0;
        double sum = 0;
        
        String sinStr = JOptionPane.showInputDialog("Exercise 4\n\n"
                + "Compute the sine of?  ");
        String cosStr = JOptionPane.showInputDialog("Compute the cosine of?: ");
        
        try {
            sinInit = Double.parseDouble(sinStr);
            cosInit = Double.parseDouble(cosStr);
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        sin = Math.sin(sinInit);
        cos = Math.cos(cosInit);
        
        double tempSin = sin*sin;
        double tempCos = cos*cos;
        
        sum = tempSin + tempCos;
        
        JOptionPane.showMessageDialog(null, "sine: " + sin + "\ncosine: " + 
                cos + "\nsum: " + sum);
    }
}
