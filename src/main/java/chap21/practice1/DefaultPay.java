package chap21.practice1;

public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("잘못된 결제입니다.");
        return false;
    }
}
