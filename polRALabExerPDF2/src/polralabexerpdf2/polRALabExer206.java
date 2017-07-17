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
public class polRALabExer206 {
    public static void main(String[] args) {
        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
        int sum= 0;
        int even = 0;
        int odd = 0;
        
        for (int z = 0; z < data.length; z++) {
            sum += data[z];
            
            if (data[z]%2 == 0){
                even += data[z];
            }
            else
                odd += data[z];
        }
        System.out.println("Sum: " + sum + "\nEven: " + even + "\nOdd: " + odd);
    }
}
