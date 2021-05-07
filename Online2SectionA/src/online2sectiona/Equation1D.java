
package online2sectiona;


public class Equation1D implements Equation,Comparable{
    private double a, b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Equation1D(double a, double b) {
        this.a = a;
        this.b = b;
    }

    
    
    @Override
    public void solve() {
        System.out.println(-b/a);
    }

    @Override
    public String toString() {
        return "Equation1D{" + "a=" + a + ", b=" + b + '}';
    }

    @Override
    public int compareTo(Object o) {
        
        Equation1D e = (Equation1D) o;
        
       return  this.b < e.b ? 100 : -100;
        
    }
    
    
}
