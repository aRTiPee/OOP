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
public class polRALiveExer14 {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Enter number: ");
        int y = Integer.parseInt(x);
        for (int z = y; z > 0; z--) {
            for (int v = z; v > 0; v--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
