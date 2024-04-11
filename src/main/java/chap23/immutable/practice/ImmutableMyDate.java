package chap23.immutable.practice;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate year(int newYear){
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate month(int newMonth){
        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate day(int newDay){
        return new ImmutableMyDate(year, month, newDay);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
