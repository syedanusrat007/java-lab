/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpractice;

import java.util.Scanner;



/**
 *
 * @author MMG_LAB_30
 */
public class Stringpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int i=10 ;
        String a;
         a=String.valueOf(i);
         System.out.println("string value of int is : " + a);
     
         a="100000";
         System.out.println("int value of string : " +Integer.parseInt(a));
         
         double b=1001.5;
         a=String.valueOf(b);
         System.out.println("string value of double is : " + a);
         
         a="100000.4456";
           System.out.println("double value of string : " +Double.parseDouble(a));
         
         float f=10.5f;
         
         System.out.println("float value of string " +String.valueOf(f));
         
         long l=1234567890123456l;
        
         System.out.println("long value of string " +String.valueOf(l));
         
         boolean d= true;
        
         System.out.println("bool value of string " +String.valueOf(b));
         
         a="true";
         System.out.println("bool value of string " +Boolean.parseBoolean(a));
         
         
         
    }
    
}
