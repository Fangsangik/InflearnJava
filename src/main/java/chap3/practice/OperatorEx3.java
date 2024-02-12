package chap3.practice;

public class OperatorEx3 {
    public static void main(String[] args) {
        int score = 80;

        if (80 <= score && score <= 100){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        boolean rst = 80 <= score && score <= 100;
        System.out.println("rst = " + rst);
    }
}
