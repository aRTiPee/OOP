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
public class polRAActualExer102 {
    public static void main(String[] args) throws IOException{
        int n;
        String mon;
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        
        String s = new String();
        
        do{
            System.out.print("Numeric Month :");
            s = x.readLine();
            n = Integer.parseInt(s);
            if (n<1 || n>12)
                System.out.println("Invalid Input");
            
        }
        while((n<1)||(n>12));
        mon = new String();
        switch(n){
            case 1 : mon = "January"; break;
            case 2 : mon = "February"; break;
            case 3 : mon = "March"; break;
            case 4 : mon = "April"; break;
            case 5 : mon = "May"; break;
            case 6 : mon = "June"; break;
            case 7 : mon = "July"; break;
            case 8 : mon = "August"; break;
            case 9 : mon = "September"; break;
            case 10 : mon = "October"; break;
            case 11 : mon = "November"; break;
            case 12 : mon = "December"; break;
        }
        System.out.println("Month in Words: " + mon);
    }
}
