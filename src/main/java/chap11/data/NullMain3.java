package chap11.data;

public class NullMain3 {
    public static void main(String[] args) {
        BigData data = new BigData();
        System.out.println("data.cnt = " + data.cnt);
        System.out.println("data.data1 = " + data.data1);

        //nullPointException
        System.out.println("data.data1.val = " + data.data1.val);
    }
}
