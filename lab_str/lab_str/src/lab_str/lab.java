/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_str;

import java.util.StringTokenizer;

/**
 *
 * @author Tonni
 */
public class lab {
    public static void main(String[] args) {
        String s =(" 1 | 3.5 | tonni ") ;  
        StringTokenizer stringTokenizer = new StringTokenizer(s, "|");

		   while (stringTokenizer.hasMoreTokens()) {

		    String id = stringTokenizer.nextToken();
		    Double price = Double.parseDouble(stringTokenizer.nextToken());
		    String username = stringTokenizer.nextToken();

			StringBuilder sb = new StringBuilder();
			sb.append("\nId : " + id);
			sb.append("\nPrice : " + price);
			sb.append("\nUsername : " + username);
			sb.append("\n*******************\n");

			System.out.println(sb.toString());
    }
    }
}
