package chap46.bounded;

import chap45.bounded.BoundedQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static chap41.util.MyLogger.log;

public class BoundedQueueV6_2 implements BoundedQueue {

    private BlockingQueue<String> queue; //스레드를 강제로 block 시킬 수 있는 것

    public BoundedQueueV6_2(int max) {
        queue = new ArrayBlockingQueue<String>(max); //size를 넣어줘야 함
    }

    @Override
    public void put(String data) {
        boolean rst = queue.offer(data);
        // 버퍼가 가득 차있는 경우 데이터를 추가하지 않고 바로 false
        log("저장 시도 결과 = " + rst);
    }

    @Override
    public String take() {
        // 버퍼가 비어있는 경우 null
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
