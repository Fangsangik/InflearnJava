package chap6;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntVal = 2147483647;
        long maxIntOver = 2147483648L;
        int intVal = 0;

        intVal = (int) maxIntVal;
        System.out.println("intVal = " + intVal);

        intVal = (int) maxIntOver;
        System.out.println("intVal = " + intVal);
    }
}
