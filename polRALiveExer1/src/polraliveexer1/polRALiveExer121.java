/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraliveexer1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author artipee
 */
public class polRALiveExer121 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        
        String name = "";
        System.out.print("Please enter your name: ");
        try{
            name = dataIn.readLine();
        }
        catch(IOException e){
            System.out.println("Error");
        }
        System.out.println("Hello "+name+"!");
    }
}
