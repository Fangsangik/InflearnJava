package chap5;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;

        for (; ;){
            sum += a;
            if (sum > 10) {
                System.out.println("sum = " + sum);
                break;
            }
            a++;
        }
    }
}
