package chap24.practice;

public class Practice4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String start = str.substring(0,5);
        String end = str.substring(5,str.length());
        System.out.println("start = " + start);
        System.out.println("end = " + end);
    }
}
