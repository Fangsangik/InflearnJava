package chap21.practice1;

public class Payment {
    public static void main(String[] args) {
        PayService service = new PayService();

        String payOption1 = "Kakao";
        int amount1 = 0;
        service.processPay(payOption1, amount1);

        String payOption2 = "naver";
        int amount2 = 10000;
        service.processPay(payOption2, amount2);

        String payOption3 = "bad";
        int amount3 = 15000;
        service.processPay(payOption1, amount3);
    }
}
