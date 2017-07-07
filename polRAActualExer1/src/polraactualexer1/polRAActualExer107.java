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
public class polRAActualExer107 {
    public static void main(String[] args) throws IOException{
        String a, b;
        int n, r;
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        a = new String ();
        System.out.print("Enter a decimal number: ");
        a = x.readLine();
        n = Integer.parseInt(a);
        b = new String();
        b = "";
        do {
            r = n;
            r = r%2;
            b = r+b;
            n = (int)(n/2);
        }
        while (n > 0);
        System.out.println("Binary equivalent: " + b);
    }
}
