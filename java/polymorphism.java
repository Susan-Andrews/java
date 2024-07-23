
public class Methodoverloading{
    public int multiply(int x, int y){
        return (x*y);
    }

    public int multiply(int x, int y, int z){
        return (x*y*z);
    }

    public double  multiply(double x, double y){
        return (x*y);
    }

    public static void main(String args[]){
        Methodoverloading demo = new Methodoverloading();
        System.out.println(demo.multiply(10,20));
        System.out.println(demo.multiply(10,20,30));
        System.out.println(demo.multiply(10.0,20.0));

    }
}
