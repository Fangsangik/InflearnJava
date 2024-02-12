package chap4.practice;

public class Practice1 {
    public static void main(String[] args) {
        int score = 85;

        switch (score / 10){
            case 9:
                System.out.println("학점은 A 입니다");
                break;
            case 8:
                System.out.println("학점은 B 입니다");
                break;
            case 7:
                System.out.println("학점은 C 입니다");
                break;
            case 6:
                System.out.println("학점은 D 입니다");
            default:
                System.out.println("학점은 F 입니다");
        }
    }
}
