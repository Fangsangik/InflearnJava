package chap26.enumerate.ex6;

import chap26.enumerate.ex6.Grade;

public class DiscountService {
    public int discount(Grade grade, int price){
        return grade.discount(price);
    }
}
