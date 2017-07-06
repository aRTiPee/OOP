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
public class polRALabExer106 {
    public static void main(String[] args) {
        int radInt = 0;
        double rad = 0;
        double area = 0;
        
        String radStr = JOptionPane.showInputDialog("Exercise 6\n\n"
                + "Input the radius (must be"
                + " an integer): ");
        try{
            radInt = Integer.parseInt(radStr);
            rad = (double) radInt;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        area = Math.PI*Math.pow(rad, 2);
        
        JOptionPane.showMessageDialog(null, "The radius is: " + radStr +
                "\nThe area is: " + area);
    }
}
