package chap47.cas.increment;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicInteger implements IncrementInteger {

    AtomicInteger atomicInteger = new AtomicInteger(0); //초기값 지정 생략하면 0

    private int value; //인터페이스 필드이기 떄문에, 여러 스레드 공유 가능

    @Override
    public void increment() {
        atomicInteger.incrementAndGet(); // 값을 하나 증가 반환
    }

    @Override
    public int get() {
        return atomicInteger.get(); // 현재 값을 반환
    }
}
