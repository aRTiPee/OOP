/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexerpdf2;

/**
 *
 * @author artipee
 */
public class polRALabExer203 {
    public static void main ( String[] args )
    {
    int[] valA = { 13, -22, 82, 17};
    int[] valB = {-12, 24, -79, -13};
    int[] sum = { 0, 0, 0, 0};
    // Add values from corresponding slots of valA and valB
    // and put the result in the corresponding slot of sum.
    for (int loop = 0; loop < valA.length; loop++){
        sum[loop] = valA[loop] + valB[loop];
    }
    System.out.println( "sum: "
    + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
}
