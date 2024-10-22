package chap48;

public class SyncProxyList implements SimpleList{

    private SimpleList target;

    // target을 주입 -> 호출되는 대상이 target에 들어감
    public SyncProxyList(SimpleList target) {
        this.target = target;
    }

    @Override
    public synchronized int size() {
        return target.size();
    }

    //lock을 획득
    @Override
    public  void add(Object e) {
        //원본 메서드 호출
        target.add(e);
        //원본 메서드 반납
        //lock 반납
    }

    @Override
    public synchronized Object get(int index) {
        return target.get(index);
    }

    @Override
    public String toString() {
        return target.toString() + " by "  + this.getClass().getSimpleName();
    }
}
