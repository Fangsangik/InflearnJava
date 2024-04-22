package chap26.enumerate.ex6;

public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    public static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " " + grade.discount(price));
    }
}
