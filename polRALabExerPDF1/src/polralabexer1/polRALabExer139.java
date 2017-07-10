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
public class polRALabExer139 {
    public static void main(String[] args) throws Exception{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("In-range Adder\n"
                + "Low end of range:");
        int low = Integer.parseInt(dataIn.readLine());
        System.out.println("High end of range:");
        int high = Integer.parseInt(dataIn.readLine());
        
        int sumIn = 0, sumOut = 0;
        while(true){
            System.out.println("Enter data: ");
            int add = Integer.parseInt(dataIn.readLine());
            if(add==0)
                break;
            if(add<low || add>high)
                sumOut += add;
            else
                sumIn += add;
        }
        System.out.println("Sum of in range values: "+ sumIn);
        System.out.println("Sum of out of range values: "+ sumOut);
    }
}
