package chap21.practice1;

public class KakoPay implements Pay{
    @Override
    public boolean pay(int amount) {
        if (amount > 0) {
            System.out.println("카카오페이 시스탬과 연결합니다");
            System.out.println(amount + " 원 결제를 시도합니다 ");
        } else {
            System.out.println("amount가 0 입니다.");
        }

        return true;
    }
}
