package chap30.ex1;

import java.util.Scanner;

public class MainV1_2 {
    public static void main(String[] args) {
        NetworkServiceV1_2 serviceV1_2 = new NetworkServiceV1_2();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("전송할 문자 : ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }
            serviceV1_2.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료 합니다");
    }
}
