package chap27.practice;

import java.time.*;

public class Practice5 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024,01,01,9,00,00);
        ZonedDateTime zdt = ZonedDateTime.of(LocalDate.of(2024,1,1), LocalTime.of(9, 0),
                ZoneId.of("Asia/Seoul"));

        ZonedDateTime zdt1 = zdt.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime zdt2 = zdt.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("zdt = " + zdt);
        System.out.println("zdt1 = " + zdt1);
        System.out.println("zdt2 = " + zdt2);
    }
}
