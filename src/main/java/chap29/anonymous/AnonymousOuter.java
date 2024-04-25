package chap29.anonymous;

import chap29.local1.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    //매개변수도 지역 변수중 하나로 볼 수 있다.
    public void process(int paramVar) {
        //지역 변순
        int localVar = 1;

        //구현하면서 인터페이스 구현체를 이름이 없이 형성
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                //지역 클래스도 내부 클래스이기 때문에 인스턴스 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
