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
public class polRALabExer217 {
    public static void main(String[] args) {
        int[][] image = {
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,5,5,5,5,5,5,5,5,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0}
        };
        // assume a rectangular image
        int[][] smooth = new int[ image.length ][ image[0].length ];

        // Compute the smoothed value for
        // non-edge locations in the image.
        int sum = 0;
        for ( int row=1; row<image.length-1; row++ ){
            for ( int col=1; col<image[row].length-1; col++ ){
                for(int x=row-1;x<row+2;x++){
                    for(int y=col-1;y<col+2;y++){
                        try{
                            sum += image[x][y];
                        }catch(ArrayIndexOutOfBoundsException e){
                            sum += 0;
                        }
                    }
                }
                smooth[row][col] = sum/9;
                sum = 0;
            }
        }

        System.out.println("INPUT:");
        for ( int row=0; row<image.length; row++ ){
            for ( int col=0; col<image[row].length; col++ ){
                System.out.print(image[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("\nOUTPUT:");
        for ( int row=0; row<image.length; row++ ){
            for ( int col=0; col<image[row].length; col++ ){
                System.out.print(smooth[row][col] + " ");
            }
            System.out.println();
        }
    }
}
