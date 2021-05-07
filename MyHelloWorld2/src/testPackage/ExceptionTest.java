
package testPackage;

public class ExceptionTest {
    
    public static int div(int i, int j) throws Exception{
        return i/j;
    }
    public static void main(String[] args) throws Exception{
        int i = 100;
        int j = 0;
        System.out.println("Before Exception");
        int k =0;
        try {
            k = i/j;
          
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch(Exception e){
            System.out.println("main : "+ e); 
        }
        
        System.out.println("After Exception: "+ k);
          System.out.println(div(100, 0));
          System.out.println("After Thrown");
//        try {
//              System.out.println(div(100, 0));
//        } catch (Exception e) {
//        }
    }
}
