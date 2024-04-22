package chap26.enumerate.ex1;

public class StringGradeEx_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("vip = " + vip);

        //오타
        int diamonnd = discountService.discount("DIAMONDD", price);
        System.out.println("diamonnd = " + diamonnd);

        //대소문자
        int gold1 = discountService.discount("Gold" , price);
        System.out.println("gold1 = " + gold1);
    }
}
