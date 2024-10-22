package chap47.cas.spinlock;

import java.util.concurrent.atomic.AtomicBoolean;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class SpinLock {
    private final AtomicBoolean lock = new AtomicBoolean(false);

    public void lock() {
        log("락 획득 시도");

        //!true -> false -> while문에서 빠져나온다.
        while (!lock.compareAndSet(false, true)) { //락이 아무도 사용하고 았지 않는다면 true & CAS 연산을 통해 원자적 변경
            log("락 획득 실패 - 스핀 대기");
        }
        log("락 획득 완료");
    }

    public void unlock() {
        lock.set(false);
        log("락 반납 완료");
    }
}
