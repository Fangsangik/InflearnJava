package chap4;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int discount = 0;

        switch (grade){
            case 1:
                discount = 1000;
                break;

            case 2:
            case 3:
                discount = 3000;
                break;

            default:
                discount = 500;
        }

        System.out.println(discount);
    }
}
