
package online2sectiona;


public class Equation2D implements Equation{
    private double  a,b,c;

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void solve() {
        double x1= (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        double x2= (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
        
        System.out.println(x1 +" and " + x2);
    }

    public Equation2D(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    
}
