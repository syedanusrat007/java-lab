
package testPackage;

import java.util.Arrays;


public class Student implements Comparable{
    private String name;
    private String id;
    private double cgpa;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", cgpa=" + cgpa + ", age=" + age + '}';
    }

     @Override
    public int compareTo(Object o) {
     Student s = (Student)o;
    return this.cgpa> s.cgpa ? -1: 1;
    //return this.name.compareTo(s.name);
    
    }
   
    
   
    
    
}
