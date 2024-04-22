package chap26.enumerate.ex3;

public class ClassGradeEx2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        //private으로 생성 X 제한
        //ClassGrade classGrade = new ClassGrade();
        //int rst = discountService.discount(classGrade, price);
       // System.out.println("rst = " + rst);
    }
}
