package chap23.immutable.practice;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 3, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        date1 = date2.year(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}
