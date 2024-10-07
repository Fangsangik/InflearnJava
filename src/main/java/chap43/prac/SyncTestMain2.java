package chap43.prac;

import static chap41.util.MyLogger.log;

public class SyncTestMain2 {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter();

        Runnable task = new Runnable() {
            public void run() {
                myCounter.count();;
            }
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();

    }

    //두 스레드가 같은 인스턴스 생성
    //스택영역은 각각의 별도의 공간, 다른 메모리와 절대 공유 하지 않음
    //지역변수는 스택 frame 영역 개별 영역에 스택공간에 생성 -> 자기 자신의 값만 접근 할 수 있다.
    //heap, 멤버 변수(필드), class -> 공유 자원이기 때문에 고려 해야 함
    static class MyCounter {

        public void count() {
            //지역 변수는 스레드를 공유하지 않는다!
            int localVal = 0;
            for (int i = 0; i < 1000; i++) {
                localVal += 1;
            }

            log("결과 : " + localVal);
        }
    }
}
