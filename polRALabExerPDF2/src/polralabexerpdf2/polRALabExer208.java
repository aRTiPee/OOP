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
public class polRALabExer208 {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] result = new int [data.length];
        int p = data.length - 1;
        
        for (int j = 0; j < data.length; j++, p--) {
            result[j] = data[p];
        }
        for (int j = 0; j < result.length; j++){
           System.out.print(result[j] + ", ");
        }
    }
}
