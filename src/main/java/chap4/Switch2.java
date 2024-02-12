package chap4;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;
        int discount = 0;

        switch (grade){
            case 1:
                discount = 1000;
                break;

            case 2:
                discount = 2000;
                break;

            case 3:
                discount = 3000;
                break;

            default:
                discount = 500;
        }

        System.out.println(discount);
    }
}
