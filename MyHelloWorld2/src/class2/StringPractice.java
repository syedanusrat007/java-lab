
package class2;

public class StringPractice {
    public static void main(String[] args) {
        int i = 100;
        
        String s = String.valueOf(i);
        System.out.println("String value of Int: "+ s);
        
        s = "354354";
        System.out.println(Integer.parseInt(s));
        
        System.out.println(Double.parseDouble(s));
        
        float f = 10.5f;
        long l = 54564564564L;
        
        //boolean b = true;
        s = "tRuE";
        
        System.out.println(Boolean.parseBoolean(s));
        
        
        s = "A9";
        System.out.println(Integer.parseInt(s, 16));
    }
    
}
