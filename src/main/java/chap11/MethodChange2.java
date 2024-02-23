package chap11;

public class MethodChange2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        System.out.println("메서드 호출 전 data.value : " + data.value);
        System.out.println(data);

        changeReference(data);
        System.out.println("메서드 호출 후 data.value :" + data.value);
    }

    public static void changeReference(Data data1) {
        System.out.println(data1);
        data1.value = 20;
    }
}
