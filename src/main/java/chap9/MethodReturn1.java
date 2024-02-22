package chap9;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean rst = odd(2);
        System.out.println(rst);
    }

    public static boolean odd(int a){
        if (a % 2 == 1){
            return true;
        }
        return false;
    }
}
