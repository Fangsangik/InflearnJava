package chap21.practice1;

public class PayService {
    private NeverPay neverPay;
    private KakoPay kakoPay;

    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다 :" + option + " , amount :" + amount);

        Pay pay = PayStore.findPay(option);
        boolean rst = pay.pay(amount);

        if (amount > 0) {
            if (rst) {
                System.out.println("결제 성공");
            } else {
                System.out.println("결제 실패 ");
            }
        } else {
            System.out.println("다시 입력하세요");
        }

    }
}
