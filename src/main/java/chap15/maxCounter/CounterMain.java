package chap15.maxCounter;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter(3);
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();

        int cnt = maxCounter.getCount();
        System.out.println(cnt);
    }
}
