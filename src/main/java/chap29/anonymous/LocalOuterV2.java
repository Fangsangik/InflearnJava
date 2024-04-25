package chap29.anonymous;

import chap29.local1.Printer;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    //매개변수도 지역 변수중 하나로 볼 수 있다.
    public void process(int paramVar){
        //지역 변순
        int localVar = 1;

        //지역 클래스
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                //지역 클래스도 내부 클래스이기 때문에 인스턴스 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        //인스턴스에 있는 값 생성
        Printer printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }
}
