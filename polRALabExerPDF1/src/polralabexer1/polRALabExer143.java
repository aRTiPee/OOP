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
public class polRALabExer143 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double eff = 100;
        double loses = 0.04;
        double limit = 50;
        int month = 0;
        while(eff>50){
            System.out.println("Month:\t"+month+"\teffectiveness: \t"+eff);
            month++;
            eff = eff-eff*loses;
        }
    }
}
