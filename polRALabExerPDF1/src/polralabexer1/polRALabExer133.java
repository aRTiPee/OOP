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
public class polRALabExer133 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int num;
        float xi, avg = 0.0f, avgxi2 = 0.0f, avgsqr = 0.0f;
        double sd;
        System.out.println("Enter N: ");
        num = Integer.parseInt(dataIn.readLine());
        int i = 1;
        while (i <= num) {
            System.out.println("Enter xi : ");
            xi = Integer.parseInt(dataIn.readLine());
            avg = avg + xi;// calculating sum of xi  
            avgsqr = avgsqr + (xi * xi); //calculating sum of squares of xi         
            i++;
        }
        avg = avg / 4;
        avgxi2 = avg * avg;
        avgsqr = avgsqr / 4;
        System.out.println("Sta " + avgsqr);
        System.out.println("Stand " + avgxi2);

        //finding standard deviation using formula   
        sd = Math.sqrt(avgsqr - avgxi2);
        System.out.println("Standard Deviation is : " + sd);
    }
}
