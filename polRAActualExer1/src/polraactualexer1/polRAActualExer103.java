/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraactualexer1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author artipee
 */
public class polRAActualExer103 {
    public static void main(String[] args) throws IOException {
        String s,s1;
        int n = 0;
        
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        s = new String();
        
        System.out.println("Month in words: ");
        s = x.readLine();
        s1 = new String();
        s1 = s.substring(0,3);
        s1 = s1.toUpperCase();
        if(s1.startsWith("JAN")) n = 1;
        else if(s1.startsWith("FEB")) n = 2;
        else if(s1.startsWith("MAR")) n = 3;
        else if(s1.startsWith("APR")) n = 4;
        else if(s1.startsWith("MAY")) n = 5;
        else if(s1.startsWith("JUN")) n = 6;
        else if(s1.startsWith("JUL")) n = 7;
        else if(s1.startsWith("AUG")) n = 8;
        else if(s1.startsWith("SEP")) n = 9;
        else if(s1.startsWith("OCT")) n = 10;
        else if(s1.startsWith("NOV")) n = 11;
        else if(s1.startsWith("DEC")) n = 12;
        
        System.out.println("Abbreaviation is : "+s1);
        System.out.println("Month number is : "+ n);
    }
}
