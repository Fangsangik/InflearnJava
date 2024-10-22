package chap47.cas.spinlock;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class SpinLockMain {
    public static void main(String[] args) {
        //SpinLockBad spinLock = new SpinLockBad();
        SpinLock spinLock = new SpinLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                spinLock.lock();
                try {
                    //critical section
                    sleep(1); //오래 걸리는 로직에서는 스핀 락 사용 X
                    log("비즈니스 로직 실행");
                } finally {
                    spinLock.unlock();
                }
            }
        };

        Thread t1 = new Thread(task, "Thread - 1");
        Thread t2 = new Thread(task, "Thread - 2");
        t1.start();
        t2.start();
    }
}
