/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polralabexerpdf2;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
/**
 *
 * @author artipee
 */
public class polRALabExer218 {
    public static void main(String[] args) throws IOException {
        File file = new File("image.txt");
      
        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file); 

        // Writes the content to the file
        for(int x=0;x<64;x+=8){
            for(int y=0;y<64;y++){
                writer.write(x+"\n" );
                writer.flush();
            }
        }
        
        writer.close();
    }
}
