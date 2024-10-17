package chap46.bounded;

import chap45.bounded.BoundedQueue;

import java.awt.print.Pageable;
import java.util.InputMismatchException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static chap41.util.MyLogger.log;

public class BoundedQueueV6_3 implements BoundedQueue {

    private BlockingQueue<String> queue; //스레드를 강제로 block 시킬 수 있는 것

    public BoundedQueueV6_3(int max) {
        queue = new ArrayBlockingQueue<String>(max); //size를 넣어줘야 함
    }

    @Override
    public void put(String data) {
        try {
            //대기 시간 설정 가능
            boolean rst = queue.offer(data, 1, TimeUnit.NANOSECONDS);
            log("저장 시도 결과 = " + rst);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String take() {
        try {
            //대기 시간 설정 가능
            return queue.poll(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
