package chap9;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(18);
        checkAge(10);
    }

    public static void checkAge(int age){
        if (age >= 18){
            System.out.println("출입 가능");
        } else {
            System.out.println("출입 불가능");
        }
    }
}
