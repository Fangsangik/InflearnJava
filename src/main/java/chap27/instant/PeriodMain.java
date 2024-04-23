package chap27.instant;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        LocalDate curDate = LocalDate.of(2020,1,1);
        LocalDate plusDate = curDate.plus(period);
        System.out.println("curDate = " + curDate);
        System.out.println("plusDate = " + plusDate);

        LocalDate starDate = LocalDate.of(2023,1,1);
        LocalDate endDate = LocalDate.of(2024,1,1);

        Period between = Period.between(starDate, endDate);
        System.out.println("between.getMonths() = " + between.getMonths() + between.getDays());
    }
}
