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
public class polRALabExer114 {
    public static double input() {
        String sInput = JOptionPane.showInputDialog("Exercise 14\n\nEnter" +
                " amount of  purchases: ");
        double convert = 0;
        try {
            convert = Double.parseDouble(sInput);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid input!", 
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return convert;
    }
    public static double process(double price, double discount) {
        double answer = price * discount;
        answer = price - answer;
        return answer;
    }
    public static void output(double answer){
        JOptionPane.showMessageDialog(null, "Discounted Price: " + answer);
    }
    public static void main(String[] args) {
        double price = 0;
        double discount = 0.1;
        double outout = 0;
        price = input();
        output(process(price, discount));
    }
}
