package chap23.immutable;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유 가능
        Address a = new Address("seoul");
        Address b = new Address("seoul");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
