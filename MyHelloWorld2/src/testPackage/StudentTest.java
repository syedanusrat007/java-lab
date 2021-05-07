
package testPackage;

import java.util.Arrays;


public class StudentTest {
    public static void main(String[] args) {
        Student student[] = new Student[10];
        
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].setName("Name: "+ (i+1));
            student[i].setId(String.valueOf(i+1));
            student[i].setAge(20+i);
            student[i].setCgpa(3+Math.random());
        }
        System.out.println("Before Sort: ");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
            
        }
        
        Arrays.sort(student);
        
        System.out.println("After Sort: ");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
            
        }
        
        
    }
}
