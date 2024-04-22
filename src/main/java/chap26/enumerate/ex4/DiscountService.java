package chap26.enumerate.ex4;

import chap26.enumerate.ex4.ClassGrade;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}
