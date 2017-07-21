/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraliveexer3;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
/**
 *
 * @author artipee
 */
public class polRALiveExer36 {
    public static void main(String[] args) {
        String pass, pass2;
        while(true){
            pass = JOptionPane.showInputDialog(null, "Register your password!");
            if(pass.length() != 0){
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Enter a password to register");
            }
        }
        JPasswordField pass3 = new JPasswordField();
        String flag = "0";
        try{
            JOptionPane.showConfirmDialog(null, pass3, "Enter your password: ", JOptionPane.OK_CANCEL_OPTION);
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        pass2 = new String(pass3.getPassword());
        if(pass2.equalsIgnoreCase(pass)){
            JOptionPane.showMessageDialog(null, "Congratulations, access granted!");
        } else {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
    }
}
