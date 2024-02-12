package chap4.practice2;

public class Practice2 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("탁원한 성과 입니다");
                break;

            case 'B':
                System.out.println("좋은 성과 입니다");
                break;

            case 'C':
                System.out.println("준수한 성과 입니다");
                break;

            case 'D':
                System.out.println("향상이 필요 합니다");
                break;

            case 'F':
                System.out.println("불합격 입니다");
                break;

            default:
                System.out.println("잘못된 학점 입니다");

        }
    }
}
