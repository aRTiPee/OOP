/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polralabexerpdf2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author artipee
 */
public class polRALabExer209 {
    public static void main(String[] args) throws Exception{
        int signal[] = new int [12];
        int smooth[] = new int [12];
        for (int p = 0; p < signal.length; p++){
            BufferedReader o = new BufferedReader(
                    new InputStreamReader(System.in));
            int i = Integer.parseInt(o.readLine());
            signal[p] = i;
        }
        System.out.print("SIGNAL: ");
        for (int u = 0; u < signal.length; u++)
            System.out.print(signal[u] + ", ");
        for (int x = 0; x < signal.length; x++){
            if (x == 0)
                smooth[x] = (signal[x] + signal[x+1])/2;
            else if (x == 11)
                smooth[x] = (signal[x-1] + signal[x])/2;
            else
                smooth[x] = (signal[x-1] + signal[x] + signal[x+1])/3;
        }
        System.out.println();
        System.out.print("SMOOTH: ");
        for (int u = 0; u < signal.length; u++)
            System.out.print(smooth[u] + ", ");
    }
}
