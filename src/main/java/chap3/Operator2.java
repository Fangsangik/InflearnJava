package chap3;

public class Operator2 {
    public static void main(String[] args) {
        String rst = "hello" + "world";
        System.out.println(rst);

        String s1 = "String1";
        String s2 = "String2";
        String rst1 = s1 + s2;
        System.out.println(rst1);

        //문자열에 숫자를 더할 수는 없지만
        //10을 문자열로 바꿔버리고 더해버림
        String rst2 = "a + b = " + 10;
        System.out.println(rst2);

        int num = 20;
        String str = "a + b = ";
        String rst3 = str + num; //20이 문자로 변경된다.
        System.out.println(rst3);
    }
}
