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
public class polRALiveExer31 {
    public static void main(String[] args) {
        double num = 0;
        double ave = 0.0;
        for(int x=1;x<=3;x++){
            while(true){
                try{
                num = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter grade for Q" + x, JOptionPane.OK_OPTION));
                if(num > 49){
                    System.out.println("Grade for Q" + x + " = " + num + "%");
                    ave += num;
                } else {
                    System.out.println("Invalid Grade! Try again");
                    x--;
                }
                break;
                }catch(NumberFormatException | NullPointerException e){
                    System.out.println("Input your grade. It cant be empty or a letter.");
                }
            }
        }
        ave = (ave/300)*100;
        System.out.println("Grade for quizzes = " + ave + "%");
    }
}
