package chap41.thread;

import static chap41.util.MyLogger.log;

public class InnerRunnableMainV4 {
    public static void main(String[] args) {
        log("main() start");

        //람다
        Thread thread = new Thread(() ->
                log("run()"));

        thread.start();
        log("main() end");
    }
}
