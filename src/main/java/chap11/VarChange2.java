package chap11;

public class VarChange2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;

        Data data1 = data;

        System.out.println("data = " + data);
        System.out.println("data1 = " + data1);

        System.out.println("data1.value = " + data.value);
        System.out.println("data1.value = " + data1.value);

        data.value = 20;
        System.out.println("data = " + data.value);
        System.out.println(".va = " + data1.value);

        data1.value = 30;
        System.out.println("data = " + data.value);
        System.out.println("data = " + data1.value);
    }
}
