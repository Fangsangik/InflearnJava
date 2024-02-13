package chap5.practice;

public class Practice3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int max = 100;

        while (i <= max){
            sum = sum + i;
            i ++;
        }
        System.out.println("sum = " + sum);

        System.out.println("++++++++++");
        max = 100;
        sum = 0;

        for (int j = 1; j <= max ; j++) {
            sum += j;
        }
        System.out.println("sum = " + sum);
    }
}
