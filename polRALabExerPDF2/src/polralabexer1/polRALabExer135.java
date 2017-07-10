/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexer1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author artipee
 */
public class polRALabExer135 {
    public static void main(String[] args) throws Exception {
        double x,y;
        BufferedReader z = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter X: ");
        x = Double.parseDouble(z.readLine());
        System.out.print("Enter N: ");
        y = Double.parseDouble(z.readLine());
        if (y < 0)
            System.out.println("N must be a positive integer");
        else {
            double p = Math.pow(x, y);
            System.out.println("Answer: " + p);
        }
            
    }
}
