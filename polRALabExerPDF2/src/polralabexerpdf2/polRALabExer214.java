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
public class polRALabExer214 {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
                      {1, 4, 4, 8, 13},
                      {9, 1, 0, 2},
                      {0, 2, 6, 3, -1, -8}
                    };
        int sum[] = new int[data.length];
        
        for ( int row=0; row < data.length; row++){
            for ( int col=0; col < data[row].length; col++){
                sum[row] += data[row][col];
            }
        }
        int max = sum[0], min = sum[0];
        for(int x=0;x<sum.length;x++){
            if(max < sum[x]){
                max = sum[x];
            }
            if(min > sum[x]){
                min = sum[x];
            }
            System.out.println("Sum of each row with indes of " + x + " : " + sum[x]);
        }
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
