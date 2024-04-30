package chap31.ex2;


import java.util.Scanner;

public class MainV2_1 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        NetworkServiceV2_2 service = new NetworkServiceV2_2();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("전송할 문자 : ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }
            service.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료 합니다");
    }
}
