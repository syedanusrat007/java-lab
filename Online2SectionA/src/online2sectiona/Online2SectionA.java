
package online2sectiona;

import java.util.Arrays;

public class Online2SectionA {

 
    public static void main(String[] args) {
        Equation1D e1 = new Equation1D(10,-5);
        Equation2D e2 = new Equation2D(1,6,7);
        e1.solve();
        e2.solve();
        Equation1D array[] = new Equation1D[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = new Equation1D(5*Math.random(),10*Math.random());
            
        }
        System.out.println("Before Sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
        Arrays.sort(array);
        
        System.out.println("After Sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
    }
    
}
