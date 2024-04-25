package chap29.local1;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    //매개변수도 지역 변수중 하나로 볼 수 있다.
    public void process(int paramVar){
        //지역 변순
        int localVar = 1;

        //지역 클래스
        class LocalPrinter {
            int value = 0;

            public void printData(){
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                //지역 클래스도 내부 클래스이기 때문에 인스턴스 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        //인스턴스에 있는 값 생성
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
