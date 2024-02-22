package chap9.practice1;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println(depositAmount(10000, 5000));
        System.out.println(withdrawAmount(10000, 5000));
        System.out.println(withdrawAmount(10000, 20000));
    }

    public static int depositAmount(int balance, int money){
        balance += money;
        return balance;
    }

    public static int withdrawAmount(int balance, int money){
        if (balance < money){
            return 0;
        }

        return balance - money;
    }
}
