/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polraactualexer1;

import java.io.*;
import java.util.*;
/**
 *
 * @author artipee
 */
public class polRAActualExer101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m;
        Random n = new Random();
        m = n.nextInt();
        System.out.println("N = " + m);
        
        if (m < 0)
            System.out.println("**** N < 0");
        else
            System.out.println("**** N > 0");
        System.out.println("Goodbye");
        
    }
    
}
