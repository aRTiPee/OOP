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
public class polRALabExer207 {
    public static void main(String[] args) {
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
        int largest = 0;
        int largest2 = 0;
        
        for (int z = 0; z < data.length; z++) {
            if (largest < data [z]){
                largest = data[z];
                data[z] = 0;
            }
        }
        for (int z = 0; z < data.length; z++) {
            if (largest2 < data [z]){
                largest2 = data[z];
                data[z] = 0;
            }
        }
        
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " +largest2);
    }
}
