package chap9.practice1;

public class Practice1 {
    public static void main(String[] args) {
        avg(1,2,3);
        avg(15,25,35);
    }

    public static double avg(int a, int b, int c){
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균 값 : " + average);
        return average;
    }
}
