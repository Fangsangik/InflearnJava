package chap45.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class BoundedQueueV3 implements BoundedQueue {

    //중간에 데이터를 보관하는 Queue
    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    //버퍼의 개수 제한
    public BoundedQueueV3(int max) {
        this.max = max;
    }

    //한번에 한 스레드 사용 -> 임계값
    //핵심 공유 자원 -> ArrayQueue, 한번에 하나의 스레드만 put, take
    //중간에 queue의 size가 변하면 안됨

    //queue에 max만큼 찬 경우
    @Override
    public synchronized void put(String data) {
        while (queue.size() == max) {
            log("[put] 큐가 가득 참 : 생산자 잠시 대기" );
            try {
                wait();
                log("[put] 생산자 깨어님");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            queue.offer(data);
            log("[put] 생신지 데이터 저장, notify() 호출");
            notify(); //wait 한 애가 깨어남. 대기 스레드 wait -> Blocked를 풀어버림
            return;
        }

        queue.offer(data);
    }

    @Override
    public synchronized String take() {
        while (queue.isEmpty()) {
            log("[take] 큐에 data 없음, 소비자 대기");
            try {
                wait();
                log("[take] 소비자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        String data = queue.poll();
        log("[take] 소비자 획득, notify() 호출");
        notify();
        //notifyAll();
        return data;

    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
