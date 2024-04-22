package chap26.enumerate.ex5;

public class DiscountService {
    public int discount(Grade grade, int price){
        return price * grade.getDiscountPercent() / 100;
    }
}
