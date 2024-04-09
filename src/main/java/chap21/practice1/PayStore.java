package chap21.practice1;

public abstract class PayStore {

    public static Pay findPay(String option){
        if (option.equals("Kakao")){
            return new KakoPay();
        } else if (option.equals("never")){
            return new NeverPay();
        } else {
            return new DefaultPay();
        }
    }
}
