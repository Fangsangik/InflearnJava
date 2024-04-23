package chap27.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Practice4 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek fdw = date.getDayOfWeek();
        DayOfWeek ldw = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("fdw = " + fdw);
        System.out.println("ldw = " + ldw);
    }
}
