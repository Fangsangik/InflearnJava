package chap15.maxCounter;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    void increment() {
        if (count >= max){
            System.out.println("최대 값을 초과 할 수 없습니다 " + count);
        }
        count++;
        System.out.println("값을 증가" + count);
    }

    public int getCount() {
      return count;
    }
}
