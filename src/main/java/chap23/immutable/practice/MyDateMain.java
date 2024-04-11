package chap23.immutable.practice;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024, 3, 1);
        MyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        date2.setYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}
