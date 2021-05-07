/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.HashMap;

/**
 *
 * @author MMG_LAB_29
 */
public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Student s= new Student(i+1, "Shakib"+i, 3+Math.random());
            map.put("Shakib"+i, s);
        }
        for(String s : map.keySet() ){
            System.out.println(map.get(s));
        }
        //System.out.println(map.get("Shakib"+9));
        
    }
    
}
