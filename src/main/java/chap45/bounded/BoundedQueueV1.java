package chap45.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static chap41.util.MyLogger.log;

public class BoundedQueueV1 implements BoundedQueue {

    //중간에 데이터를 보관하는 Queue
    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    //버퍼의 개수 제한
    public BoundedQueueV1(int max) {
        this.max = max;
    }

    //한번에 한 스레드 사용 -> 임계값
    //핵심 공유 자원 -> ArrayQueue, 한번에 하나의 스레드만 put, take
    //중간에 queue의 size가 변하면 안됨

    //queue에 max만큼 찬 경우
    @Override
    public synchronized void put(String data) {
        if (queue.size() == max) {
            log("[put] 큐가 가득 참, 버림: " + data);
            return;
        }

        queue.offer(data);
    }

    @Override
    public synchronized String take() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();

    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
