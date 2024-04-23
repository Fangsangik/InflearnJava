package chap27.instant;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMillis(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        LocalTime plusTime = lt.plus(duration);
        System.out.println("plusTime = " + plusTime);

        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("근무시간 " + between.toHours() + " 시간 " + between.toMinutesPart() + " 분");

    }
}
