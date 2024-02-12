package chap4;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 3;
        int discount = 0;

        if (grade == 1){
            discount = discount + 1000;
        } else if (grade == 2){
            discount = discount + 2000;
        } else if (grade == 3){
            discount = discount + 3000;
        } else {
            discount = discount + 500;
        }

        System.out.println("발급 받은 쿠폰 " + discount + "원");
    }
}
