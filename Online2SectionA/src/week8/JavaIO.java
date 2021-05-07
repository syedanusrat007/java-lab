
package week8;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JavaIO {
    
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("E:/Java/slides/class 2.txt");
            fos = new FileOutputStream("E:/Java/slides/class 2copy.txt");
            while(true){
                int i = fis.read();
                
                if(i == -1 ) break;
                fos.write(i);
                System.out.print((char) i);
            }
        } catch (Exception e) {
        }finally{
            try {
                 fis.close();
                 fos.close();
            } catch (Exception e) {
            }
        }
        
        
        
        
        
    }
    
}
