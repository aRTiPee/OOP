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
public class polRALabExer134 {
    public static void main(String[] args) throws Exception{
        int input;
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Upper Limit: ");
        input = Integer.parseInt(x.readLine());
        double m = ((input*(input+1))*(2*input+1))/6;
        double n = ((Math.pow(input, 2))*(Math.pow(input+1, 2)))/4;
        System.out.println("The sum of Squares is: " + m + "\nThe sum of "
            + "Cubes is " + n);
    }
}
