package chap29.local2;

import chap29.local1.Printer;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    //매개변수도 지역 변수중 하나로 볼 수 있다.
    public Printer process(int paramVar){
        //지역 변수 (지역변수는 스텍 영역이 종료되는 순간 함께 제거된다.)
        int localVar = 1;

        //지역 클래스
        class LocalPrinter implements Printer {
            int value = 0;
            //paramVar
            //localVar => caputure 한 내용에 접근

            @Override
            public void print() {

                System.out.println("value = " + value);

                //인스턴스는 지역변수 보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                //지역 클래스도 내부 클래스이기 때문에 인스턴스 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        //인스턴스에 있는 값 생성
        LocalPrinter printer = new LocalPrinter();
        //printer.print();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행, process 스택 프레임이 사라진 이후에 실행
        printer.print();

        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
