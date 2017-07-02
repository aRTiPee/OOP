/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexer2;

import javax.swing.JOptionPane;

/**
 *
 * @author artipee
 */
public class polRALabExer21 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int input[] = new int[9];
        
        for (int p = 0; p < 9; p++) {
            
            int i = p+1;
            
            String o = JOptionPane.showInputDialog("Enter digit " + 
                    i + " (1-9): ");
            if (o == null) {
                System.exit(0);
            }
            
            try {
                input[p] = Integer.parseInt(o);
                
                if (input[p] < 1 || input[p] > 9){
                    int q = JOptionPane.showConfirmDialog(null, "Input must be"
                            + " inclusive  between 1 and 9! Try again?", 
                            "ERROR!", JOptionPane.YES_NO_OPTION);
                    if (q == JOptionPane.YES_OPTION)
                        again();
                    else if (q == JOptionPane.NO_OPTION)
                        System.exit(0);
                    else 
                        System.exit(0);
                }
            }
            catch (Exception e) {
                int q = JOptionPane.showConfirmDialog(null, "Incorrect Input!"
                        + " Try again?", "ERROR!", JOptionPane.YES_NO_OPTION);
                if (q == JOptionPane.YES_OPTION);
                else if (q == JOptionPane.NO_OPTION)
                    System.exit(0);
                else 
                    System.exit(0);
                again();
            }
            
            for (int y = 0; y < 9; y++){
                if (p == y);
                else if (input[p] == input[y]) {
                    int q = JOptionPane.showConfirmDialog(null, "Input can't be "
                            + "same with others. Try again?", "ERROR!", 
                            JOptionPane.YES_NO_OPTION);
                    if (q == JOptionPane.YES_OPTION);
                    else if (q == JOptionPane.NO_OPTION)
                        System.exit(0);
                    else 
                        System.exit(0);
                    again(); 
                }
                    
            }
            
        }
        for (int u = 1; u <= input.length; u++) {
            System.out.print(input[u-1] + " ");
            
            if (u % 3 == 0)
                System.out.println();
        }
        
        computeArray(input[0], input[1], input[2]);
        computeArray(input[3], input[4], input[5]);
        computeArray(input[6], input[7], input[8]);
        computeArray(input[0], input[3], input[6]);
        computeArray(input[1], input[4], input[7]);
        computeArray(input[2], input[5], input[8]);
        computeArray(input[0], input[4], input[8]);
        computeArray(input[2], input[4], input[6]);
        
        int q = JOptionPane.showConfirmDialog(null, "CORRECT ANSWER! Want to "
                    + "play again?", "Congratulations!", 
                            JOptionPane.YES_NO_OPTION);
                    if (q == JOptionPane.YES_OPTION);
                    else if (q == JOptionPane.NO_OPTION)
                        System.exit(0);
                    else 
                        System.exit(0);
        
    }
    
    public static void computeArray(int x, int y, int z) {
        if (x + y + z != 15) {
            int q = JOptionPane.showConfirmDialog(null, "Wrong Input! " + x + 
                    ", " + y + "and " + z + " doesn't equal to '15'!"
                    + "Try Again?", "ERROR!", 
                            JOptionPane.YES_NO_OPTION);
                    if (q == JOptionPane.YES_OPTION);
                    else if (q == JOptionPane.NO_OPTION)
                        System.exit(0);
                    else 
                        System.exit(0);
            again();
        }
    }
    
    public static void again(){
        String[] args = new String [0];
        main(args);
    }
    
}
