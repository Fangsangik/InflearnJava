package chap4;

public class IF5 {
    public static void main(String[] args) {
        int itemPrice = 10000;
        int age = 10;
        int rst = 0;


        if (itemPrice >= 10000){
            rst = rst + 1000;
            System.out.println("10000원 이상 구매 1000원 할인");
        }else if (age <= 10){
            rst = rst + 1000;
            System.out.println("10살이하 1000원 할인");
        }

        System.out.println(rst + "원");

        if (false)
            System.out.println("실행 됨");
            System.out.println("실행 안됨");
    }
}