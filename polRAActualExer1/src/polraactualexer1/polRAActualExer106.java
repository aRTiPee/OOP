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
public class polRAActualExer106 {
    public static void main(String[] args) throws IOException{
        long i, f = 1L;
        
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String a = new String ();
        System.out.print("Enter a number: ");
        a = x.readLine();
        int n = Integer.parseInt(a);
        for (i = 1; i <= n; ++i)
            f *= i;
        System.out.println("Factorial is: " + f);
    }
}
