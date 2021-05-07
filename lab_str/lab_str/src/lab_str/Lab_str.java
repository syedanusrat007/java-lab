/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_str;

import java.util.Scanner;

/**
 *
 * @author Tonni
 */
public class Lab_str {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        double d;
        long l;
        String s;
        Scanner input = new Scanner(System.in);
        s= input.nextLine();
        System.out.println(Integer.parseInt(s));
        s= input.nextLine();
        System.out.println(Double.parseDouble(s));
        s= input.nextLine();
        System.out.println(Long.parseLong(s));
        i= input.nextInt();
        System.out.println(String.valueOf(i));
        d= input.nextDouble();
        System.out.println(String.valueOf(d));
        l= input.nextLong();
        System.out.println(String.valueOf(l));
        input.nextLine();
         s=input.nextLine();
        System.out.println(s);
        s=input.next();
        System.out.println(s);
                
    }
}
