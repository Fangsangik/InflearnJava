package chap27.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2018,1,1,13,30,59);
        System.out.println("ldt = " + ldt);

        LocalDateTime changedDt1 = ldt.with(ChronoField.YEAR, 2020);
        System.out.println("changedDt1 = " + changedDt1);

        LocalDateTime changeDt2 = ldt.withYear(2020);
        System.out.println("changeDt2 = " + changeDt2);

        LocalDateTime with1 = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("ldt = " + ldt);
        System.out.println("with1 = " + with1);

        LocalDateTime with2 = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("with2 = " + with2);
    }
}
