
package class2;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("Int value is: "+ i);
        double d = scan.nextDouble();
        System.out.println("Double value: "+d);
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println(s);
        
        
        short sh = Short.parseShort(scan.nextLine());
        System.out.println(sh);
    }
}
