/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.ArrayList;

/**
 *
 * @author MMG_LAB_29
 */
public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add("Shakib"+ i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list1.get(i));
            
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            list2.add( i+1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list2.get(i));
            
        }
        
        ArrayList<Student> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student s= new Student(i+1, "Shakib"+i, 3+Math.random());
            list3.add(s);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list3.get(i));
            
        }
    }
    
}
