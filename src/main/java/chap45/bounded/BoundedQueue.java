package chap45.bounded;

public interface BoundedQueue {
    void put(String data);

    //버퍼에 보관된 값 가져감
    String take();
}
