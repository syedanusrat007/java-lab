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
public class scnrprctce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       int i = scan.nextInt();
       double d = scan.nextDouble();
       System.out.println("int :" +i+ " double :" + d);
      
       String s= scan.nextLine();
        //scan.nextLine();
       String s1= scan.next();
        System.out.println(s);
         System.out.println(s1);
          scan.nextLine();
      long l= Long.parseLong(scan.nextLine());
        System.out.println("long :" +l);
    }
}
