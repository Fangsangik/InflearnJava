package chap47.cas.spinlock;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

//스레드 둘다 락을 획득하는 문제 발생!
//스레드 둘다 비즈니스 로직 실행
//임계영역이 보호 되지 않는다.
public class SpinLockBad {
    private volatile boolean lock = false; // 한 스레드만 락 획득

    //락 사영 여부 확인 & 락의 값 변경 -> 원시적이지 않음
    public void lock() {
        log("락 획득 시도");

        while (true) {
            if (!lock) { //락 사용 여부 확인
                sleep(100);
                lock = true; //락 값 변경
                break;
            } else {
                //락을 획득할 때까지 스핀 대기 (Runnable 상태로 계속 대기)
                log("락 획득 실패 - 스핀 대기");
            }
        }

        log("락 획득 완료");
    }

    public void unlock() {
        lock = false;
        log("락 반납 완료");
    }
}
