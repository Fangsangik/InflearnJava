package chap41.util;

import static chap41.util.MyLogger.log;

//따로 생성 할 수 없게 적용
public abstract class ThreadUtils {
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            log("인터럽트 발생 : "  + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
