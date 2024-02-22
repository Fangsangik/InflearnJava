package chap9.practice1;

public class Practice2 {
    public static void main(String[] args) {
        hello("Hello World", 3);
        hello("Hello World", 5);
        hello("Hello World", 7);
    }

    public static void hello(String str, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
}
