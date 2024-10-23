package chap49.executor.future;

import java.util.concurrent.*;

import static chap41.util.MyLogger.log;

public class SumTaskBadMainV2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        ExecutorService es = Executors.newFixedThreadPool(2);

        //하나 던지고 결과 받고 하나 던지고 결과 받고
        Future<Integer> f1 = es.submit(task1);
        Integer sum1 = f1.get(); //2초 대기
        Future<Integer> f2 = es.submit(task2); //2초 대기
        Integer sum2 = f2.get();

        log("task1.result =" + sum1);
        log("task2.result =" + sum2);

        int sumAll = sum1 + sum2;
        log("task1 + task2 = " + sumAll);
        log("end");
        es.shutdown();
    }

    static class SumTask implements Callable<Integer> {
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        //Exception의 자식들을 모두 잡아서 던질 수 있다.
        public Integer call() throws Exception {
            log("작업 시작");
            Thread.sleep(2000);
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }

            result = sum;

            log("작업 완료 result = " + sum);

            return sum;
        }
    }
}
