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
public class polRALabExer213 {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
                      {1, 4, 4, 8, 13},
                      {9, 1, 0, 2},
                      {0, 2, 6, 3, -1, -8}
                    };
        int longest_col = 0;
        for(int x=0;x<data.length;x++){
            if(data[x].length> longest_col){
                longest_col = data[x].length;
            }
        }
        System.out.println(longest_col);
        int sum[] = new int[longest_col];
        for (int row=0; row < data.length; row++){
            for ( int col=0; col < data[row].length; col++){
                sum[col] += data[row][col];
            }
        }
        for(int x=0;x<sum.length;x++){
            System.out.println("Sum of each column with index of " + x + " : " + sum[x]);
        }
    }
}
