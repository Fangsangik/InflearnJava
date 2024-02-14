package chap6;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;

        if (m > 10) {
            int tmp = m * 2;
            System.out.println("tmp = " + tmp);
        }
        System.out.println("m = " + m);
    }
}
