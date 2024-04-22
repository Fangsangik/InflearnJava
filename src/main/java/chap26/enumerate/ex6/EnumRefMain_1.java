package chap26.enumerate.ex6;



public class EnumRefMain_1 {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("BASIC = " + Grade.BASIC.discount(price));
        System.out.println("GOLD = " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND = " + Grade.DIAMOND.discount(price));
    }

    public static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " " + grade.discount(price));
    }
}
