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
public class polRALabExer211 {
    public static void main(String[] args) {
        int [][] data = {{3, 2, 5},
            {1, 4, 4, 8, 13},
            {9, 1, 0, 2},
            {0, 2, 6, 3, -1, -8}};
        int sum = 0;
        
        for (int  x = 0; x < data.length; x++){
            for (int y = 0; y < data[x].length; y++){
                sum += data[x][y];
            }
        }
        System.out.println(sum);
    }
}
