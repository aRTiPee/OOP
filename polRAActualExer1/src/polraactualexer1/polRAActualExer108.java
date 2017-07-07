/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraactualexer1;

import java.io.*;
/**
 *
 * @author artipee
 */
public class polRAActualExer108 {
    public static void main(String[] args) throws IOException {
        String s;
        double grd, tot=0.0, num;
        long ave;
        int i;
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        s = new String ();
        
        for (i = 1; i <= 5; i++){
            System.out.println("Grade " + i + " : ");
            s = x.readLine();
            grd = Double.parseDouble(s);
            tot += grd;
        }
        ave = Math.round(tot/5);
        System.out.println("Average Grade: " + ave);
        if ((ave >= 98) && (ave<=100))
            num = 1.00;
        else if ((ave >= 95) && (ave <= 97))
            num = 1.25;
        else if ((ave >= 92) && (ave <= 94))
            num = 1.50;
        else if ((ave >= 89) && (ave <= 91))
            num = 1.75;
        else if ((ave >= 86) && (ave <= 88))
            num = 2.00;
        else if ((ave >= 83) && (ave <= 85))
            num = 2.25;
        else if ((ave >= 80) && (ave <= 82))
            num = 2.50;
        else if ((ave >= 77) && (ave <= 79))
            num = 2.75;
        else if ((ave >= 75) && (ave <= 76))
            num = 3.00;
        else 
            num = 5.00;
        System.out.println("Numeric Code : " + num);
    }
}
