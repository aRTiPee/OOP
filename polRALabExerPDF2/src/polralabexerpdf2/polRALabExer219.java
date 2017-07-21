/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexerpdf2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
/**
 *
 * @author artipee
 */
public class polRALabExer219 {
    public static void main(String[] args) {
        String fileName = "image.txt";
        String line;
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader in = new BufferedReader(fr);
            line = in.readLine();
            int count = 0;
            do{
                try{
                    int line2 = Integer.parseInt(in.readLine());
                    if(line2 > -1 && line2 < 8){
                        System.out.print(" ");
                    } else if(line2 > 7 && line2 < 16){
                        System.out.print(".");
                    } else if(line2 > 15 && line2 < 24){
                        System.out.print(",");
                    } else if(line2 > 23 && line2 < 32){
                        System.out.print("-");
                    } else if(line2 > 31 && line2 < 40){
                        System.out.print("+");
                    } else if(line2 > 39 && line2 < 48){
                        System.out.print("o");
                    } else if(line2 > 47 && line2 < 56){
                        System.out.print("O");
                    } else if(line2 > 55){
                        System.out.print("x");
                    }
                    count++;
                    if(count % 128 == 0){
                        System.out.println();
                    }
                }catch(NumberFormatException e){
                    break;
                }
            }while(line != null);
            in.close();
        }catch (IOException e){
          System.out.println("Problem reading " + fileName );
        }
    }
}
