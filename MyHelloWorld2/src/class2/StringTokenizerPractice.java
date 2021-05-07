
package class2;

import java.util.StringTokenizer;

public class StringTokenizerPractice {
    public static void main(String[] args) {
        StringTokenizer token = new StringTokenizer("MIST CSE BATCH 15. JAVA COURSE.");
        
        
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
        
        System.out.println("After comma delim: ");
        token = new StringTokenizer("MIST, CSE, BATCH, 15. JAVA, COURSE.",", ");
        
        
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
        
    }
}
