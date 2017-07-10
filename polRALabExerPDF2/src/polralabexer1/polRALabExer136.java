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
public class polRALabExer136 {
    public static void main(String[] args) throws Exception {
        System.out.print("Initial number of stars: ");
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int z = Integer.parseInt(x.readLine());
        for (int p = z+1; p > 0; p--){
            for (int o = p; o > 1; o--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
