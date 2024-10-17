package chap46.bounded;

import chap45.bounded.BoundedQueue;
import chap45.bounded.BoundedQueueV3;
import chap45.bounded.ConsumerTask;
import chap45.bounded.ProducerTask;

import java.util.ArrayList;
import java.util.List;

import static chap41.util.MyLogger.log;
import static chap41.util.ThreadUtils.sleep;

public class BoundedMain {
    public static void main(String[] args) {
        //BoundedQueueV4 queue = new BoundedQueueV4(2);
        //BoundedQueueV5 queue = new BoundedQueueV5(2);
        //BoundedQueueV6_1 queue = new BoundedQueueV6_1(2);
        //BoundedQueueV6_2 queue = new BoundedQueueV6_2(2);
        //BoundedQueueV6_3 queue = new BoundedQueueV6_3(2);
        BoundedQueueV6_4 queue = new BoundedQueueV6_4(2);
        // 생산자 소비자 실행 순서 선택, 반드시 하나만 선택
        producerFirst(queue);
        //consumerFirst(queue);
    }

    private static void producerFirst(BoundedQueue queue) {
        log("== [생산자 먼저 실행] 시작 " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads = new ArrayList<>();
        startProducer(queue, threads);
        printAllState(queue, threads);
        startConsumer(queue, threads);
        printAllState(queue, threads);
        log("== [생산자 먼저 실행] 종료 " + queue.getClass().getSimpleName() + " ==");

    }

    private static void consumerFirst(BoundedQueue queue) {
        log("== [소비자 먼저 실행] 시작 " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads = new ArrayList<>();
        startConsumer(queue, threads);
        printAllState(queue, threads);
        startProducer(queue, threads);
        printAllState(queue, threads);
        log("== [소비자 먼저 실행] 종료 " + queue.getClass().getSimpleName() + " ==");

    }


    private static void startProducer(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("생산자 시작");
        for (int i = 1; i <= 3; i++) {
            Thread producer = new Thread(new ProducerTask(queue, "data" + i), ("producer" + i)); //data 생성
            threads.add(producer);
            producer.start();
            sleep(100);
        }
    }

    private static void startConsumer(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("소비자 시작");
        for (int i = 1; i <= 3; i++) {
            Thread consumer = new Thread(new ConsumerTask(queue), "consumer" + i);
            threads.add(consumer);
            consumer.start();
            sleep(100);
        }
    }

    //스레드에 담긴 값들을 출력
    private static void printAllState(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("현재 상태 출력, 큐 데이터 : " + queue);
        for (Thread thread : threads) {
            log(thread.getName() + ": " + thread.getState());
        }
    }
}
