/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraliveexer3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author artipee
 */
public class polRALiveExer34 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hi " + name + ". Nice to meet you!");
        int year = 0;
        while(true){
            try{
                year = Integer.parseInt(JOptionPane.showInputDialog("Enter your year of birth!"));
                if(Integer.toString(year).length() == 4 && year < 2018){
                    break;
                } else if(year > 2018){
                    JOptionPane.showMessageDialog(null, "Are you not born yet? Enter valid year!");
                } else{
                    JOptionPane.showMessageDialog(null, "Enter valid year.");
                }
            }
            catch (NumberFormatException | NullPointerException e){
                System.out.println("Enter your birth year.");
            }
        }
        JOptionPane.showMessageDialog(null, "Your age this year is " + (2017-year));
    }
}
