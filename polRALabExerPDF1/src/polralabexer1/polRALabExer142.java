/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexer1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author artipee
 */
public class polRALabExer142 {
    public static void main(String[] args) throws Exception {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double debit = 1000;
        System.out.println("Enter the monthly payment: ");
        int payment = Integer.parseInt(dataIn.readLine());
        int total_payments = 0;
        for(int x=1; x<12; x++){
            total_payments += payment;

            debit = (debit - payment)+(debit*0.015);
            System.out.println("Month:\t"+x+"  balance:\t"+debit+" total payments:\t" +total_payments);
        }
    }
}
