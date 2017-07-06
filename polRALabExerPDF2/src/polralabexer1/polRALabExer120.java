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
public class polRALabExer120 {
    public static void main(String[] args) {
        String item = "";
        double price = 0;
        double ot = 0;
        double shipping = 2;
        double total = 0;
        
        try {
            item = JOptionPane.showInputDialog("Exercise 20\n\n"
                    + "Enter the item:");
            String priceS = JOptionPane.showInputDialog("Enter the price: ");
            price = Double.parseDouble(priceS);
            price = price * 0.01;
            String otS = JOptionPane.showInputDialog("Overnight Delivery "
                    + "(0 == no, 1 == yes)");
            ot = Double.parseDouble(otS) ;
            if (ot > 1 || ot < 0) {
                JOptionPane.showMessageDialog(null, "Invalid Input.", 
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Input.", 
                    "ERROR!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (price > 10)
            shipping += 3;
        if (ot == 1)
            shipping += 5;
        total = shipping + price;
        JOptionPane.showMessageDialog(null, "INVOICE:\n\n" + item + "    " +
                price + "\n\nShipping:    " + shipping + "\n\nTotal:    " +
                total);
    }
}
