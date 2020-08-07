/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author tanjil
 */
public class multidemensionalarrays {
    
    public static void main(String[] args) {
        
        int[][] multiarrays = {
            {5,6,2,6},
            {4,1,2,4},
            {122,232,235}
        };
        
        for(int row = 0; row < multiarrays.length; row++){
            // System.out.println(row);
            for(int column = 0; column < multiarrays[row].length;column++){
                // System.out.println(column);
                System.out.print(multiarrays[row][column]+"\t");
            }
            System.out.println();
        }
        for(int i = 0; i<30; i++){
            System.out.print("=");
        }
        System.out.println("\n");
        
       int grid[][] = {
           {1,2,3},
           {6,7,8},
           {9,10,11},
           {12,13,14}
       };
       for(int i = 0; i<grid.length; i++){
           for(int j = 0; j<grid[i].length; j++){
               System.out.print(grid[i][j] + "\t");
           }
           System.out.println();
       }
        
    }
    
}
