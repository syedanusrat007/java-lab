
package class2;

import class3.PracticeClass3;
import java.util.Arrays;


public class ArrayPractice {
    
    public static void main(String[] args) {
       
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            
        }
        System.out.println("");
        double d [][] = new double[5][10];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] +" ");
                
            }
            System.out.println("");
            
        }
        
        
        int zig[][] = new int[5][];
//        zig[0] = new int[1];
//        zig[1] = new int[2];
//        zig[2] = new int[3];
//        zig[3] = new int[4];
//        zig[4] = new int[5];
        
        for (int i = 0; i < zig.length; i++) {
            zig[i] = new int[i+1];
            
        }
        
        for (int i = 0; i < zig.length; i++) {
            for (int j = 0; j < zig[i].length; j++) {
                
                System.out.print(zig[i][j] +" ");
            }
            System.out.println("");
        }
        
        int sort[] = {-10,1,2,3,-20,25,50};
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));
        
        
        PracticeClass3 obj = new PracticeClass3();
        
    }
}
