package chap27.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Practice3 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2024,1,1);
        LocalDate end = LocalDate.of(2024,11,12);

        Period between = Period.between(start, end);
        long dayBetween = ChronoUnit.DAYS.between(start, end);

        System.out.println("start = " + start);
        System.out.println("end = " + end);
        System.out.println("between = " + between.getYears());
        System.out.println("between = " + between.getDays());
        System.out.println("dayBetween = " + dayBetween);
    }
}
