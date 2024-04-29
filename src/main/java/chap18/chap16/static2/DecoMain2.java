package chap18.chap16.static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = Decoutil2.deco(s);

        System.out.println("before " + s);
        System.out.println("after " + deco);
    }
}
