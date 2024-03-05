package chap16.static2;

public class DecoData {
    private int instanceVal;
    private static int staticVal;

    public static void staticCall() {
        // instanceVal++; compile Error, 인스턴스 변수 접근
        // instanceMethod(); compile Error, 인스턴스 메서드 접근

        staticVal++;//정적 변수 접근
        staticMethod();
    }

    public void instanceCall(){
        instanceVal++;
        instanceMethod();
        staticVal++;
        staticMethod();
    }

    public void instanceMethod() {
        System.out.println("instanceVal = " + instanceVal);
        instanceVal++;
    }

    public static void staticCall(DecoData data){
        data.instanceVal++;
        data.instanceMethod();
    }

    public static void staticMethod() {
        System.out.println("staticVal = " + staticVal);
    }
}
