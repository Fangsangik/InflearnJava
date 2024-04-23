package chap27.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month){
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        int offset = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        String[] weeks = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};

        for (String week : weeks) {
            System.out.print(week + " ");
        }

        System.out.println();

        for (int i = 0; i < offset; i++) {
            System.out.print("  ");
        }

        LocalDate dayIter = firstDayOfMonth;
        while (dayIter.isBefore(firstDayOfNextMonth)){
            System.out.printf("%2d ", dayIter.getDayOfMonth());

            if (dayIter.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIter = dayIter.plusDays(1);
        }
    }
}
