

package online1mist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;




public class Online1MIST {

  
    public static void main(String[] args) {
        BufferedReader br;
        StringBuilder str= new StringBuilder();
        
        try {
            br = new BufferedReader(new FileReader("input.txt"));
            while(true){
                String s = br.readLine();
                if(s == null) break;
                str.append(s);
                str.append("\n");
               
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        String tmp = new String (str);
        //
        //System.out.println(tmp);
        //your task start here 
        int lines =0, commas =0;
        for (int i = 0; i < tmp.length(); i++) {
           
            if(tmp.charAt(i) =='\n'){
                lines++;
            }
            if(tmp.charAt(i) ==','){
                commas++;
            }
        }
        System.out.println("Line Count: "+ lines);
        System.out.println("Comma Count: "+ commas);
        
        
        lines = commas = 0;
        StringTokenizer token = new StringTokenizer(tmp,"\n");
        
        while(token.hasMoreTokens()){
            token.nextToken();
            lines++;
        }
        
        System.out.println("Line Count: "+ lines);
       
        
        token = new StringTokenizer(tmp,",");
        while(token.hasMoreTokens()){
            token.nextToken();
            commas++;
        }
        System.out.println("Comma Count: "+ (commas-1));
       
        
        token = new StringTokenizer(tmp,";");
        int forCount =0;
        while(token.hasMoreTokens()){
            if(token.nextToken().toLowerCase().equals("for")){
                forCount++;
            }
        }
        System.out.println("For Count: "+ forCount);
        
        
        token = new StringTokenizer(tmp,"\n");
        
        while(token.hasMoreTokens()){
           String temp = token.nextToken();
           if(temp.toLowerCase().indexOf("for")>0)
            System.out.println(temp.toLowerCase().indexOf("for"));
        }
        
        System.out.println(tmp.toLowerCase().replaceAll("for", "for all"));
        
        
    }
    
}
