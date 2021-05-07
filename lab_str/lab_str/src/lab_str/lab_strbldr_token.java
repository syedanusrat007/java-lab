/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_str;

import java.util.StringTokenizer;
import sun.print.PSPrinterJob;

/**
 *
 * @author Tonni
 */
public class lab_strbldr_token {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tonni");
        
        sb.append(" is good ");
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        sb.insert( 3, " very ");
        System.out.println(sb);
        
        sb.delete(2, 8);
        System.out.println(sb);
        
       
        System.out.println( sb.capacity());
        
         
         System.out.println(sb.codePointAt(4));
         
          sb.replace(4, 8, "mist");
          System.out.println(sb);
          
          
          System.out.println(sb.subSequence(3, 5));
         
          System.out.println(sb.toString());
          
          String s = (" Tonni is good ");
          StringTokenizer st = new StringTokenizer(s);
          
          while(st.hasMoreTokens())
          {
              System.out.println(st.nextToken());
          }
          
           String s1 = (" Tonni.is.good ");
          StringTokenizer st1 = new StringTokenizer(s1, ".");
          
          while(st1.hasMoreTokens())
          {
              System.out.println(st1.nextToken());
          }
          
    }
}
