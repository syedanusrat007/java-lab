
package myclass;

import java.util.Scanner;

public class Myclass {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       int id = input.nextInt();
       Scanner input1 = new Scanner(System.in);
       String name = input1.nextLine();
        myclass1 m=new myclass1();
        m.print();
        myclass1 n=new myclass1(id,name);
        n.print();
    }
}
