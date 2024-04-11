package chap23.immutable;

public class RefMain3 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유 가능
        Address a = new Address("seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void change(Address address, String changeAddress){
        System.out.println("changeAddress = " + changeAddress);
        address.setValue(changeAddress);
    }
}
