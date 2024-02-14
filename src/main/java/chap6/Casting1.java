package chap6;

public class Casting1 {
    public static void main(String[] args) {
        int intVal = 10;
        long longVal;
        double doubleVal;

        longVal = intVal;
        System.out.println("longVal = " + longVal);

        doubleVal = longVal;
        System.out.println("doubleVal = " + doubleVal);

        doubleVal = intVal;
        System.out.println("doubleVal1 = " + doubleVal);

        doubleVal = 20L;
        System.out.println("doubleVal2 = " + doubleVal);
    }
}
