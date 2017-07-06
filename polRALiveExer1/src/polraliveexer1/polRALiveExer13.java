/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraliveexer1;

import javax.swing.JOptionPane;
/**
 *
 * @author artipee
 */
public class polRALiveExer13 {
    public static void main(String[] args) {
        String eqn;
        int x = 0;
        while (x == 0){
            eqn = JOptionPane.showInputDialog("1+1: ");
            if (eqn.equalsIgnoreCase("2")) {
                JOptionPane.showMessageDialog(null, eqn + " is the correct answer!");
                x++;
            }
            else 
                JOptionPane.showMessageDialog(null, eqn + " is wrong!");
        }
    }
}
