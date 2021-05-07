
package testPackage;

public class TestClass3 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        B b = new B(10);
        System.out.println(b.sum());
        A a = b;
        System.out.println(a.sum());
        A a2 = new A(20);
        //b = (B)a2;
        //System.out.println(b.sum());
    }
}

class A{
    private int i;
    protected char c;

    public A(int i) {
        this.i = i;
    }

    public A(int i, char c) {
        this.i = i;
        this.c = c;
    }

    public  int sum(){
        return i+10;
    }
    
    
}

class B extends A{
    
    private double d;
    protected int c;
    public B(int c) {
        super(10,'A');
        this.c = c;
        super.c = (char)c;
    }
    @Override
    public int sum(){
        return c+100;
    }
    
}
