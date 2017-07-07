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
public class polRALabExer131 {
    public static void main(String[] args) {
        String inputS = "";
        int input = 0;
        try {
            inputS = JOptionPane.showInputDialog("Exercise 31\n\n"
                    + "How many integers will be added: ");
            input = Integer.parseInt(inputS);
            
            int arr[] = new int[input];
            
            for (int m = 0; m < arr.length; m++){
                String n = JOptionPane.showInputDialog("Enter an integer: ");
                arr[m] = Integer.parseInt(n);
            }
            int temp = 0;
            for (int b = 0; b < arr.length; b++)
                temp += arr[b];
            JOptionPane.showMessageDialog(null, "The sum is " + temp);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input!", "ERROR!", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
