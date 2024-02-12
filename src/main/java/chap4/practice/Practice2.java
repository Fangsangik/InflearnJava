package chap4.practice;

public class Practice2 {
    public static void main(String[] args) {
        int distance = 1;

        if (1 <= distance) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }
    }
}
