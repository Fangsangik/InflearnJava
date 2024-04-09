package chap21.practice1;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PayService service = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요 : ");
            String option = sc.nextLine();

            System.out.print("금액을 입력하세요 : ");
            int amount = sc.nextInt();
            if (amount == 0) {
                System.out.println("다시 입력하세요 ");
                return;
            }

            if (option.equals("exit")){
                System.out.println("BYE BYE");
                return;
            }

            service.processPay(option, amount);
        }
    }
}
