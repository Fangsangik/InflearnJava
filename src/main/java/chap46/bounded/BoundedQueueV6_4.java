package chap46.bounded;

import chap45.bounded.BoundedQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static chap41.util.MyLogger.log;

public class BoundedQueueV6_4 implements BoundedQueue {

    private BlockingQueue<String> queue; //스레드를 강제로 block 시킬 수 있는 것

    public BoundedQueueV6_4(int max) {
        queue = new ArrayBlockingQueue<String>(max); //size를 넣어줘야 함
    }

    @Override
    public void put(String data) {
        queue.add(data); //IllegalStateException : Queue full
    }

    @Override
    public String take() {
        return queue.remove(); //NoSuchElementException
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
