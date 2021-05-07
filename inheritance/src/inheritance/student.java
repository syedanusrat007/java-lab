/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;


/**
 *
 * @author Tonni
 */
public class student {
    protected String name;
     protected double roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

  

    public student() {
    }

    public student(String name, double roll) {
        this.name = name;
        this.roll = roll;
    }
    
     
    
}

class student1 extends student{
    private double number;

    public student1(double number) {
        this.number = number;
    }

    public student1(double number, String name, double roll) {
        super(name, roll);
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    
        
        
    }

   
    
    
    


