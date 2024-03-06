package chpa17;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
        //data1 = 20; final은 값은 최초에 한번만 할당 가능

        final int data2 = 20;
        //data2 = 20; X

        method(10);
    }

    static void method(final int parameter){
        //parameter = 20; method = 10으로 이미 할당
    }
}
