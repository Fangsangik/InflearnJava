package chap6;

public class Casting2 {
    public static void main(String[] args) {
        double doubleVal = 1.5;
        int intVal = 0;

        intVal = (int) doubleVal; //명시작 casting 해줘야 함
        System.out.println(intVal);
        System.out.println("doubleVal = " + doubleVal); // 값 변경 되지는 않는다
    }
}
