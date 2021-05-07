package myhelloworld2;


public class MyHelloWorld2 {
    public static void main(String[] args) {
        
        
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i].length());
//            
//        }
        
        String str = "hELLO wORLD";
        
        System.out.println(str.charAt(2));
        System.out.println(str.compareTo("hello world"));
        System.out.println(str.compareToIgnoreCase("hello world"));
        System.out.println(str.contains("hello"));
        System.out.println(str.contains("hELLO"));
        System.out.println(str.toLowerCase());
   
        System.out.println(str.toUpperCase());
        String str2 ="HelLo";
        System.out.println(str.toUpperCase().contains(str2.toUpperCase()));
    
        System.out.println(str.endsWith("RL"));
        System.out.println(str.startsWith("h"));
        System.out.println(str.equals(str));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.indexOf("MIST"));
        System.out.println(str.indexOf("wORLD"));
        System.out.println(str.indexOf('E'));
        System.out.println(str.indexOf(str, 0));
        System.out.println(str.length());
        
        System.out.println(str.substring(0));
        System.out.println(str.substring(5));
        System.out.println(str.substring(6, 8));
        System.out.println("  Hello MIST    ".trim());
        
        char c[] = str.toCharArray();
        String s = String.valueOf(c);
        System.out.println(s);
        int i = 10;
        System.out.println(String.valueOf(i));
     
    }
    
}
