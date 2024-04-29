package chap18.chap16.memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data = new Data(10); //힙 영역에 생성
        method2(data);
        System.out.println("method2 end");
    }

    static void method2(Data data) {
        System.out.println("method2 start");
        System.out.println("data.val = " + data.getVal());
        System.out.println("method2 end");
    }

}
