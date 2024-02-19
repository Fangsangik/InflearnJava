package chap8.practice2;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subject = new String[]{"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 점수를 입력하세요 ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subject[j] + " 점수");
                scores[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }

            double avg = 0;
            avg = (double) total / 3;
            System.out.println((i + 1) + " 번 학생의 총점 :"  + total + " 평균 :" +  avg);
        }
    }
}