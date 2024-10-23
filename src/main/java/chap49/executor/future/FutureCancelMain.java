package chap49.executor.future;

import java.util.concurrent.*;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class FutureCancelMain {

    private static boolean mayInterruptIfRunning = true;
    //private static boolean mayInterruptIfRunning = false;

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<String> future = es.submit(new MyTask());
        //log("future state: " + future.state());

        sleep(3000);

        //cancel 호출
        log("future.cancel(" + mayInterruptIfRunning + ") 호출");
        boolean cancelResult1 = future.cancel(mayInterruptIfRunning);
        log("future.cancel(" + mayInterruptIfRunning + ") result: " + cancelResult1);

        //결과 확인
        try {
            log("Future result : " + future.get());
        } catch (CancellationException e) { //Runtime 예외
            log("Future는 이미 취소 되었습니다.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
    }

    static class MyTask implements Callable<String> {
        @Override
        public String call() throws Exception {
            try {
                for (int i = 0; i < 10; i++) {
                    log("작업 중 : " + i);
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                log("인터럽트 발생");
                return "Interrupted";
            }

            return "completed";
        }
    }
}
