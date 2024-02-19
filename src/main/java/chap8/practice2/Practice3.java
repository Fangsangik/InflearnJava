package chap8.practice2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생수를 입력하세요 :");
        int studentsTotalCnt = sc.nextInt();
        String[] subject = new String[]{"국어", "영어", "수학"};

        int[][] arr = new int[studentsTotalCnt][3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i +1) + " 번 학생의 성적을 입력하세요");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(subject[j] + "점수");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < studentsTotalCnt; i++) {
            int total = 0;
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
            System.out.println((i + 1) + "번째 " + total);

            double avg = total / 3;
            System.out.println((i + 1) + "번째 "  +avg);
        }

    }
}
