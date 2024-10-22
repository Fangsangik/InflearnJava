package chap48;

import static chap41.util.MyLogger.log;

//두개를 넣었는데 하나의 값만 넣어짐
public class SimpleListMainV2 {
    public static void main(String[] args) throws InterruptedException {
       //test(new BasicList());
        //test(new SyncList());

        //target에 basicList가 들어감
        BasicList basicList = new BasicList();
        SyncProxyList syncProxyList = new SyncProxyList(basicList);
        //proxyList에 있는 add를 호출 -> synchronized를 건다
        test(syncProxyList);
    }

    private static void test(SimpleList list) throws InterruptedException {
        log(list.getClass().getSimpleName());

        Runnable addA = new Runnable() {

            //Thread A
            @Override
            public void run() {
                list.add("A");
                log("Thread-1 : List.add(A)");
            }
        };

        Runnable addB = new Runnable() {


            //Thread B
            @Override
            public void run() {
                list.add("B");
                log("Thread-2 : List.add(B)");
            }
        };

        Thread thread1 = new Thread(addA, "Thread-1");
        Thread thread2 = new Thread(addB, "Thread-2");

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        log(list);
    }
}
