/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraactualexer1;

import java.io.*;
import java.util.*;
/**
 *
 * @author artipee
 */
public class polRAActualExer105 {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        String s;
        
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        s = x.readLine();
        a = Integer.parseInt(s);
        System.out.println("B = ");
        s = x.readLine();
        b = Integer.parseInt("C = ");
        s = x.readLine();
        c = Integer.parseInt(s);
        System.out.print("C = ");
        s = x.readLine();
        c = Integer.parseInt(s);
        if( (a<b) && (a>c))
            if(b<c)
                System.out.println(a + " "+ b + " "+c);
            else
                System.out.println(a + " " + c + " " + b);
        else if( (b<a) && (b>c))
            if(a<c)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(b + " " + c + " " + a);
        else
            if(a<b)
                System.out.println(c + " " + a + " " + b);
            else
                System.out.println(c + " " + b + " " + a);
    }
}
