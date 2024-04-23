package chap27.time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);

        LocalDate ofDate = LocalDate.of(2024, 03, 05);
        System.out.println("ofDate = " + ofDate);

        //불변이기 때문에 반환값 받아야 한다
        LocalDate plusDay = ofDate.plusDays(10);
        System.out.println("plusDay = " + plusDay);
    }
}
