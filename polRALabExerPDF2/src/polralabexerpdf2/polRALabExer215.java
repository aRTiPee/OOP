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
public class polRALabExer215 {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
                      {1, 4, 4, 8, 13},
                      {9, 1, 0, 2},
                      {0, 2, 6, 3, -1, -8}
                    };
        int lar[] = new int[data.length];
        for(int x=0;x<lar.length;x++){
            lar[x] = data[x][0];
        }
        for ( int row=0; row < data.length; row++){
            for ( int col=0; col < data[row].length; col++){
                if(lar[row] < data[row][col]){
                    lar[row] = data[row][col];
                }
            }
        }
        for(int x=0;x<lar.length;x++){
            System.out.println("Largest element of each row " + x + " : " + lar[x]);
        }
    }
}
