package chap27.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포멧팅 : 날짜를 문자로
        LocalDateTime date = LocalDateTime.of(2024,12,31, 13, 30, 59 );
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = date.format(formatter);
        System.out.println("formattedDateTime = " + formattedDateTime);

        //파싱 : 문자를 날짜로
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsedDate = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("parsedDate = " + parsedDate);
    }
}
