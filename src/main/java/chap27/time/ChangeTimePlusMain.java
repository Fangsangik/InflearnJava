package chap27.time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plus1 = dt.plus(10, ChronoUnit.YEARS);
        Period period = Period.ofYears(10);
        LocalDateTime pl2 = dt.plus(period);

        System.out.println("plus1 = " + plus1);
        System.out.println("pl2 = " + pl2);
    }
}
