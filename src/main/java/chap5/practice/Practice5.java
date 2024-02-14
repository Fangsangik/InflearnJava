package chap5.practice;

public class Practice5 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = rows; i >= 1; --i) { // 역순으로 출력
            for (int j = 1; j <= i; ++j) { // 각 줄의 별 출력
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
