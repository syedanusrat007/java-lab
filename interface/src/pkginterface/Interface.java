

interface I1 {

    int sum(int i, int j);

    int sub(int i, int j);

    int mul(int i, int j);
}

interface I2 extends I1 {

    int div(int i, int j);
}

class IA implements I2 {

    @Override
    public int sum(int i, int j) {
        return i + j;
    }
    

    @Override
    public int sub(int i, int j) {
        return i - j;
    }

    @Override
    public int mul(int i, int j) {
        return i*j;
    }

    @Override
    public int div(int i, int j) {
        return i/j;
    }

}

public class Interface {

    public static void main(String[] args) {
       IA obj = new IA();
       
        System.out.println( obj.sum(10,10)+"\n" +obj.sub(10,10)+ "\n" +obj.mul(10,10)+"\n" +obj.div(10,10));
    }
}
