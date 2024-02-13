package chap5.practice;

public class Practice2 {
    public static void main(String[] args) {

        for (int num = 2, cnt = 1; cnt <= 10 ; cnt++, num += 2) {
            System.out.println("num = " + num);
        }

       int num = 2;
       int cnt = 1;

        while (cnt <= 10){
            System.out.println("num = " + num);
            num += 2;
            cnt++;
        }
    }
}
