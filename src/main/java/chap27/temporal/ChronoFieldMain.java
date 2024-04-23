package chap27.temporal;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        ChronoField[] fields = ChronoField.values();

        for (ChronoField field : fields) {
            System.out.println(field + "field = " + field.range());
        }

        System.out.println("MONTH_OF_YEAR " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH " + ChronoField.DAY_OF_MONTH.range());
    }
}
