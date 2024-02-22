package chap9;

public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1, 2.0);
        myMethod(2.0, 1);
    }

    public static void myMethod(int a, double d){
        System.out.println("int a , double d");
    }

    public static void myMethod(double a, int d){
        System.out.println("double a , int d");

    }
}
