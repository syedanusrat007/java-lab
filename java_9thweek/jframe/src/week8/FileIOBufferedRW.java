
package week8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class FileIOBufferedRW {
    public static void main(String[] args) {
        
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("Class3.txt"));
            bw = new BufferedWriter(new FileWriter("Class3Copy.txt"));
            while (true) {                
               String s = br.readLine();
               if(s == null) break;
               bw.write(s);
               bw.newLine();
               System.out.println(s);
            }
        } catch (Exception e) {
        } finally{
            try {
                br.close();
                bw.close();
            } catch (Exception e) {
            }
        }
        
    }
    
}
