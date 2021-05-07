 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author Tonni
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        double roll,number;
        
        Scanner input = new Scanner(System.in);
        name= input.nextLine();
        roll = input.nextInt();
         student1 o = new student1(10.0,name,roll);
         
        o.setNumber(100);
        System.out.println( o.getName()+ " "+ o.getRoll()+" "+o.getNumber());
       
    }
}
