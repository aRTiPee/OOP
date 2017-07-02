/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraliveexer2;

import javax.swing.JOptionPane;
/**
 *
 * @author artipee
 */
public class polRALiveExer22 {
    public static void main(String[] args) {
        String x[] = new String [16];
        
        for(int i = 0; i < 16; i++){
            String p = JOptionPane.showInputDialog("Enter name: ");
            x[i] = p;
        }
        
        for (int o = 1; o < 17; o++){
            System.out.print(x[o-1] + " ");
            if (o % 4 == 0)
                System.out.println();
        }
    }
}
