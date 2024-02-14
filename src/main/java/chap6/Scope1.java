package chap6;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        if (true){
            int x = 20; //x 생존 시작
            System.out.println("If m = " + m);
            System.out.println("If x = " + x);
        } //x 생존 끝

        //System.out.println("x = " + x); -> x는 접근 불가
        System.out.println("m = " + m); //-> 접근가능
    }
}
