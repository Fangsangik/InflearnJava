package chap44.sync;

import chap43.sync.BankAccount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class BankAccountV5 implements BankAccount {

    private int balance;
    private final Lock lock = new ReentrantLock();

    public BankAccountV5(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());

        // lock을 얻을 수 있으면 얻고, 얻을 수 없다면, 바로 반환
        if (!lock.tryLock()) {
            log("[진입 실패] : 이미 처리중인 작업이 있습니다.");
            return false;
        }

        //lock을 걸고 나면 무조건 try ~ finally를 걸어서 무조건 unlock이 되게 한다.
        try {
            log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
            if (balance < amount) {
                log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
                return false;
            }
            log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
            sleep(1000);
            balance = balance - amount;
            log("[출금 완료] 출금액: " + amount + ", 변경 잔액: " + balance);
            //== 임계 영역 ==
        } finally {
            lock.unlock();// ReentrantLock -> lock 해제
            //lock을 걸면 무조건 unLock을 해줘야 함 -> waiting 걸린 애가 빠져나오지 못함
        }

        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        lock.lock();//ReentrantLock 이용하여 Lock 걸기
        try {
            return balance;
        } finally {
            lock.unlock();// ReentrantLock -> lock 해제
        }
    }
}
