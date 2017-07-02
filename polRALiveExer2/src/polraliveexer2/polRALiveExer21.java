/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraliveexer2;

/**
 *
 * @author artipee
 */
public class polRALiveExer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String animals[] = {
            "dog", "cat", "cow", "bird",
            "spider", "ant", "hawk", "racoon",
            "lion", "tiger", "donkey", "elephant",
            "lizard", "frog", "snake", "alligator"};
        
        for (int x = 1; x < 17; x++){
            System.out.print(animals[x-1] + " ");
            if (x % 4 == 0)
                System.out.println();
        }
        
    }
    
}
