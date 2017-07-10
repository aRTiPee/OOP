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
public class polRALabExer108 {
    public static void main(String[] args) {
        int cents = 0;
        int nickels = 0;
        int dime = 0;
        int quarter = 0;
        int dollars = 0;
        int container = 0;
        
        String input = JOptionPane.showInputDialog("Exercise 8\n\n"
                + "Input the cents (integer"
                + " only): ");
        
        try {
            container = Integer.parseInt (input);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        if (container > 99) {
            dollars = container/100;
            container -= (dollars*100);
        }
        if (container > 25) {
            quarter = container/25;
            container -= (quarter*25);
        }
        if (container > 10) {
            dime = container/10;
            container -= (dime*10);
        }
        if (container > 5) {
            nickels = container/5;
            container -= (nickels*5);
        }
        cents = container;
        
        displayAnswer(dollars, quarter, dime, nickels, cents);
    }
    
    public static void displayAnswer( int dollars, int quarters, int dimes, 
            int nickels, int cents) {
        String dollar = "";
        String quarter = "";
        String dime = "" ;
        String nickel = "";
        String cent = "and 0 cents.";
        
        if (dollars == 1) {
            dollar = Integer.toString(dollars);
            dollar += " dollar, ";
        }
        else if (dollars > 1) {
            dollar = Integer.toString(dollars);
            dollar += " dollars, ";
        }
        if (quarters == 1) {
            quarter = Integer.toString(quarters);
            quarter += " quarter, ";
        }
        else if (quarters > 1) {
            quarter = Integer.toString(quarters);
            quarter += " quarters, ";
        }
        if (dimes == 1) {
            dime = Integer.toString(dimes);
            dime += " dime, ";
        }
        else if (dimes > 1) {
            dime = Integer.toString(dimes);
            dime += " dimes, ";
        }
        if (dimes == 1) {
            dime = Integer.toString(dimes);
            dime += " dime, ";
        }
        else if (dimes > 1) {
            dime = Integer.toString(dimes);
            dime += " dimes, ";
        }
        if (nickels == 1) {
            nickel = Integer.toString(nickels);
            nickel += " nickel, ";
        }
        else if (nickels > 1) {
            nickel = Integer.toString(nickels);
            nickel += " nickels, ";
        }
        if (cents == 1) {
            cent = Integer.toString(cents);
            cent = "and " + cent + " cent.";
        }
        else if (cents > 1) {
            cent = Integer.toString(cents);
            cent = "and " + cent + " cents.";
        }
        JOptionPane.showMessageDialog(null, "Your change is: \n" + 
                dollar + quarter + dime + nickel + cent);
    }
   
}
