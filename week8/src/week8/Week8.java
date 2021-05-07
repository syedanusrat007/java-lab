/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author Tonni
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Week8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileInputStream fis;
         FileOutputStream fos;
        try{
            fis = new FileInputStream("E:/MIST/l-2 t-2/java lab/1.txt");
        fos=new FileOutputStream("E:/MIST/l-2 t-2/java lab/1.txt");
           
            while(true){
                int i = fis.read();
                fos.write(i);
                if(i==-1) break;
                System.out.println((char)i);
            }
        }
        catch(Exception e)
        {
    } finally
        {
            try{
                fis.close();
            }catch(Exception e){
            }
            }
        }
}

