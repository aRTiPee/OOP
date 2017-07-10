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
public class polRALabExer141 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("First corner X coordinate:");
        int x1 = Integer.parseInt(dataIn.readLine());
        System.out.println("First corner Y coordinate:");
        int y1 = Integer.parseInt(dataIn.readLine());
        System.out.println("Second corner X coordinate:");
        int x2 = Integer.parseInt(dataIn.readLine());
        System.out.println("Second corner Y coordinate:");
        int y2 = Integer.parseInt(dataIn.readLine());
        
        int height = y2-y1;
        int width = x2-x1;
        if(height ==0 || width==0)
            System.exit(0);
        int area = height * width;
        
        System.out.println("Width: "+width+" Height: "+height+" Area: "+ area);
    }
}
