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
public class polRALabExer130 {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Exercise 30\n\n"
                + "Enter first word:");
        String y = JOptionPane.showInputDialog("Enter second word: ");
        int a = x.length();
        int b = y.length();
        int c = (50-(a+b));
        System.out.print(x);
        for (int m = 0; m < c; m++)
            System.out.print(".");
        System.out.println(y);
    }
}
