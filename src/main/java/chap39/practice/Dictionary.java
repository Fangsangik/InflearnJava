package chap39.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {

        Map<String, String> save = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("== 단어 입력 단계 ==");

        while (true) {
            System.out.print("단어를 입력하세요 (종료는 'q') : ");
            String input = sc.nextLine();

            if (input.equals("q")){
                break;
            }

            System.out.println("한글 뜻을 입력하세요 : ");
            String inputKorean = sc.nextLine();
            save.put(input, inputKorean);
        }

        System.out.println("== 단어 검색 단계 ==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') :");
            String search = sc.nextLine();

            if (search.equals("q")){
                break;
            }

            if (save.containsKey(search)) {
                String rst = save.get(search);
                System.out.println(search + " 의 뜻 " + rst);
            } else {
                System.out.println(search + " 사전에 없는 단어 입니다. ");
            }
        }
    }
}
