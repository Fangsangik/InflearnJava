package chap26.enumerate.ex3;

import chap26.enumerate.ex2.ClassGrade;

public class DiscountService {

    public int discount(Grade grade, int price){
        int discountPercent = 0;

        if (grade == Grade.BASIC){
            discountPercent = 10;
        } else if (grade == Grade.GOLD){
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND){
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}
