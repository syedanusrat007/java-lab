/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpractice;

import java.util.Arrays;

/**
 *
 * @author MMG_LAB_30
 */
public class array {
    public static void main(String[] args) {
        int i[] = new int[20];
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j] + " ");
            
        }
        
          double d [] [] = new double [10] [5];
          for (int j = 0; j < d.length; j++) {
              for (int k = 0; k < d[j].length; k++) {
                     System.out.print(d[j][k] + " ");
                  
              }
              System.out.println("");
              
        
        }
          
            int zigarray[][]=new int [5][];
            zigarray[0] = new int [1];
            zigarray[1] = new int [2];
            zigarray[2] = new int [3];
            zigarray[3] = new int [4];
            zigarray[4] = new int [5];
        for (int j = 0; j < zigarray.length; j++) {
            for (int k = 0; k < zigarray[j].length; k++) {
               System.out.print(zigarray[j][k] + " ");
                
            }
             System.out.println("");
        }
        int array []= {5,2,8,0,-2,10};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }   
}
