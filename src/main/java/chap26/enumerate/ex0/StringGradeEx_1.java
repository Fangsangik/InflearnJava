package chap26.enumerate.ex0;

public class StringGradeEx_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);

        //오타
        int diamonnd = discountService.discount("DIAMONDD", price);

        //대소문자
        int gold1 = discountService.discount("Gold" , price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
