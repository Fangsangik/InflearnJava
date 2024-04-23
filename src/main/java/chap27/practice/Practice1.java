package chap27.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Practice1 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 01, 01, 00, 00, 00);
        LocalDateTime future = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("ldt = " + ldt);
        System.out.println("future = " + future);
    }
}
