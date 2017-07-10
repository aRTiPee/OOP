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
public class polRALabExer123 {
    public static void main(String[] args) {
        
        int x = 0; int y = 0; int z = 0;
        String name = "";
        try {
            name = JOptionPane.showInputDialog("Exercise 23\n\n"
                    + "Welcome to Yertle's Quest\n\n"
                    + "Enter the name of your character");
            String tempX = JOptionPane.showInputDialog("Enter Strength "
                    + "(1-10):");
            x = Integer.parseInt(tempX);
            String tempY = JOptionPane.showInputDialog("Enter Health"
                    + " (1-10): ");
            y = Integer.parseInt(tempY);
            String tempZ = JOptionPane.showInputDialog("Enter Luck (1-10): ");
            z = Integer.parseInt(tempZ);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        if (x+y+z > 15)
            JOptionPane.showMessageDialog(null, "You have give your character "
                    + "too many points! Default values have been assigned:\n" +
        name + ", strength: 5, health: 5, luck: 5");
        else
            JOptionPane.showMessageDialog(null, "You have give your character "
                    + "a points! Values are:\n" + name +
        ", strength: " + x + ", health: " + y + ", luck: " + z + ".");
        
    }
}
