/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfunc;

import java.util.Scanner;

/**
 *
 * @author Tonni
 */
public class Stringfunc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String a= input.nextLine();
        String b = input.nextLine();
    
        System.out.println("cahr at " +a.charAt(3));
        System.out.println("lenght a :" +a.length());
        System.out.println("lenght b " +b.length());
        System.out.println( "inex1 " +a.indexOf(b));
        System.out.println( "inex2 " + a.indexOf('t'));
        
        System.out.println("lastinex1 " +a.lastIndexOf(b));
        System.out.println( "lastinex2 " + a.lastIndexOf('t'));
        System.out.println( "starts " +a.startsWith(b));
        System.out.println("ends " +a.endsWith(b));
        System.out.println(  "substring1 " + a.substring(3));
       // System.out.println(  "substring2 " + a.substring(3,7));
        System.out.println(  "lower " + a.toLowerCase());
         System.out.println(  "upper " + a.toUpperCase());
          System.out.println(  "trim " + a.trim());
         System.out.println(  "compare1 " + a.compareTo(b));
         System.out.println(  "compare2 " + a.compareToIgnoreCase(b));
         System.out.println(  "contain " + a.contains(b));
          System.out.println(  "equals " + a.equals(b));
           System.out.println(  "equals1 " + a.equalsIgnoreCase(b));
         if(a.contains(b)==true)
         {
             if(a.length()==b.length())
             System.out.println("equal");
         }
         
         
          
          
        
        
         
    }
}
