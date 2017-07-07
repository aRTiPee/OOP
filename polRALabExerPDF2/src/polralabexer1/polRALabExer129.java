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
public class polRALabExer129 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Exercise 29\n\n"
                + "Enter a word: ");
        int x = input.length();
        for (int m = 0; m < x; m++)
            System.out.println(input);
    }
}
