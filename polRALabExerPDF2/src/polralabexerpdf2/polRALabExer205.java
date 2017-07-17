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
public class polRALabExer205 {
    public static void main ( String[] args )
    {
        int[] val = {0, 1, 2, 3};
        int temp[] = new int[val.length];
        int tempp = 0;
        
        System.out.println( "Original Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
        // reverse the order of the numbers in the array
        for (int loop = val.length - 1; loop >= 0; loop--, tempp++){
            temp[loop] = val[tempp];
            
        }
        for (int z = 0; z < temp.length; z++){
            val[z] = temp[z];
        }
        System.out.println( "Reversed Array: "
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    }
}
