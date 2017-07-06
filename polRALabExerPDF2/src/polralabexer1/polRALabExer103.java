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
public class polRALabExer103 {
    public static void main(String[] args) {
        double april = 0;
        double may = 0;
        double june = 0;
        double avg = 0;
        
        String aprilStr = JOptionPane.showInputDialog("Exercise 3\n\n"
                + "Rainfall for April: ");
        String mayStr = JOptionPane.showInputDialog("Rainfall for May: ");
        String juneStr = JOptionPane.showInputDialog("Rainfall for June: ");
        
        try {
            april = Double.parseDouble(aprilStr);
            may = Double.parseDouble(mayStr);
            june = Double.parseDouble(juneStr);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        avg = (april + may + june)/3;
        
        JOptionPane.showMessageDialog(null, "Rainfall for April\t: " + aprilStr 
                + "\nRainfall for May\t: " + mayStr
                + "\nRainfall for June\t: " + juneStr + "\n\n" +
                "Average Rainfall\t: " + avg);
    }
}
