/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexerpdf2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author artipee
 */
public class polRALabExer210 {
    public static void main(String[] args) {
        
        String fileName = "CoffeeData.txt";
        String line = null;
        int firstLine = 0;
        int loop = 0;
        double data[] = new double[0];
        double ave = 0;
        double far = 0;
        double farAns = 0;
         
       try {
           
            ///////////// FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            /////////////Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            
            /////////////////////EXECUTION/////////////////////////////
            while((line = bufferedReader.readLine()) != null) {
                if (firstLine == 0){
                    int temp;
                    data = new double[temp = Integer.parseInt(line)];
                    firstLine++;
                }
                else {
                    data[loop] = Double.parseDouble(line);
                    System.out.println("data[" + loop + "]: = " + data[loop]);
                    loop++;
                }
            }   
            
            for (int p = 0; p < data.length; p++){
                ave += data[p];
            }
            System.out.println("average: " + (ave = ave/data.length));
            for (int p = 0; p < data.length; p++) {
                if (far < Math.abs(ave - data[p])){
                    far = Math.abs(ave - data[p]);
                    farAns = data[p];
                }
            }
            System.out.println("most distant value: " + farAns);
            ave = 0;
            for (int p = 0; p < data.length; p++){
                if (data[p] != farAns)
                    ave += data[p];
            }
            System.out.println("new average: " + (ave = ave/data.length));
            
            ////////////////// Always close files.
            bufferedReader.close();         
            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
           }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
    }
}
