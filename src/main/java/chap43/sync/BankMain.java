package chap43.sync;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        //BankAccount bankAccount = new BankAccountV1(1000);
        //BankAccount bankAccount = new BankAccountV2(1000);
        BankAccount bankAccount = new BankAccountV3(1000);

        Thread t1 = new Thread(new WithdrawTask(bankAccount, 800), "t1");
        Thread t2 = new Thread(new WithdrawTask(bankAccount, 800), "t2");
        t1.start();
        t2.start();

        sleep(50);
        log("t1 state : "  + t1.getState());
        log("t2 state : "  + t2.getState());

        t1.join();
        t2.join();
        log("최종 잔액 : "  + bankAccount.getBalance());
    }
}
