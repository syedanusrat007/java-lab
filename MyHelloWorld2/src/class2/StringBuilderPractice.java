
package class2;


public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("MIST CSE");
        
        str.append(" BATCH 15");
        System.out.println(str);
        
        str.deleteCharAt(0);
        System.out.println(str);
        str.delete(0, 3);
        System.out.println(str);
        str.delete(0, 0);
        System.out.println(str);
        str.insert(5, " JAVA ");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.replace(0, 2, "MIST");
        System.out.println(str);
    }
}
