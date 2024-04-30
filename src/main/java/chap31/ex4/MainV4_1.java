package chap31.ex4;


import java.util.Scanner;

public class MainV4_1 {
    public static void main(String[] args) {
        NetworkServiceV4 service = new NetworkServiceV4();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            try {
                service.sendMessage(input);
            } catch (Exception e){
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료 합니다");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e){
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("== 개발자 디버깅 메시지 ==");
        e.printStackTrace(System.out); // 예외 발생시 trace 츨력하면 도움 많이 된다.
        // e.printStackTrace();

        // 필요하면 예외 별도 추가 처리 기능
        if (e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류] : " + sendEx.getSendData());
        }
    }
}
