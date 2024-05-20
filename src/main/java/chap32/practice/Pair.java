package chap32.practice;

public class Pair <T, X>{
    private T first;
    private X second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public X getSecond() {
        return second;
    }

    public void setSecond(X second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
