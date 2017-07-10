/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexer1;

import java.io.*;
/**
 *
 * @author artipee
 */
public class polRALabExer138 {
    public static void main(String[] args) throws Exception{
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Initial Miles: ");
        double a = Double.parseDouble(x.readLine());
        if (a < 0) {
            System.out.println("bye");
            System.exit(0);
        }
        System.out.print("Final Miles: ");
        double b = Double.parseDouble(x.readLine());
        if (b < 0) {
            System.out.println("bye");
            System.exit(0);
        }
        System.out.print("Gallons: ");
        double c = Double.parseDouble(x.readLine());
        double d = (b-a)/c;
        System.out.println("Miles per Gallon: " + d);
    }
}
