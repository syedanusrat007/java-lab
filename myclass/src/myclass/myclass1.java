
package myclass;

public class myclass1 {
    private int id;
    private String name;
    public myclass1()
    {
        this.id=0;
        this.name="NULL";
    }
     public myclass1(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
     public void print()
     {
         System.out.println("ROLL : "+id+"\n"+"name : "+name);
     }
    
}
