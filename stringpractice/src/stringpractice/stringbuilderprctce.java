/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpractice;

/**
 *
 * @author MMG_LAB_30
 */
public class stringbuilderprctce {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("hello mist");
        
       
        str.append(" batch 15");
        System.out.println(str);
        
        str.reverse();
         System.out.println(str);
         
         str.deleteCharAt(0);
         System.out.println(str);
          
         str.delete(3, 10);
          System.out.println(str);
          
          str.insert(5, " cse ");
          System.out.println(str);
          
          str.replace(3, 7, " mirpur dohs ");
          System.out.println(str);
          
         
          
          
    }
}
