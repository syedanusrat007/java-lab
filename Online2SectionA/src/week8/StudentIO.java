
package week8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable{
    private int id;
    private String name;
    private double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", cgpa=" + cgpa + '}';
    }
    
    
}

public class StudentIO {
    public static void main(String[] args) {
        Student s = new Student(1,"Shakib",3.4);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Student.txt"));
            oos.writeObject(s);
        } catch (Exception e) {
        }finally{
            try {
                oos.close();
            } catch (Exception e) {
            }
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Student.txt"));
             Student s1 = (Student) ois.readObject();
             System.out.println(s1);
        } catch (Exception e) {
        }finally{
            try {
                ois.close();
            } catch (Exception e) {
            }
        }
    }
}
