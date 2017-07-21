/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraliveexer3;

import javax.swing.JOptionPane;
/**
 *
 * @author artipee
 */
public class polRALiveExer37 {
    public static void main(String[] args) {
        String pass, pass2;
        while(true){
            pass = JOptionPane.showInputDialog("Register a password:");
            if(pass.length() != 0){
                break; 
            }else{
                JOptionPane.showMessageDialog(null, "Field cannot be empty!");
            }
        }
        
        while(true){
            pass2 = JOptionPane.showInputDialog("Enter your password:");
            if(pass2.length() != 0){
                break; 
            }else{
                JOptionPane.showMessageDialog(null, "Field cannot be empty!");
            }
        }
        
        if(pass.equalsIgnoreCase(pass2)){
            JOptionPane.showMessageDialog(null, "Access Granted!");
        } else {
            JOptionPane.showMessageDialog(null, "Access Denied!");
        }
    }
}
