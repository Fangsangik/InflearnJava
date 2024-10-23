package chap49.executor.future;

import java.util.concurrent.*;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class FutureExceptionMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        log("작업 전달");
        Future<Integer> future = es.submit(new ExCallable());
        sleep(1000);

        try {
            log("future.get() 호출 시도, future.state()" + future.isDone()); //FAILED
            Integer result = future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

            //실행 중에 예외 발생 call 안에 코드를 발생하는 예외
        } catch (ExecutionException e) {
            log("e = " + e);
            Throwable cause = e.getCause(); //ExecutionException이 왜 발생했는지
            log("cause = " + cause);
        }

        es.shutdown();
    }

    static class ExCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("Callable 실행, 예외 발생");
            throw new IllegalArgumentException("ex!"); //callable이 호출해서 예외 발생
        }
    }
}
