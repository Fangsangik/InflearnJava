package chap41.thread;

public class DemonThreadMain {
    public static void main(String[] args) {

        //main이 실행 중
        //Thread-0 : run() -> 실행
        System.out.println("Thread.currentThread().getName()" + " : main() start"); // 실행중인 스레드 호출

        DemonThread demonThread = new DemonThread();
        demonThread.setDaemon(true); //데몬 스레드 여부
        //false로 변경 -> 10 초 기다리고 종료 함
        demonThread.start(); // run 호출 하면 안됨
        System.out.println("Thread.currentThread().getName()" + " : main() end");
        //프로그램 바로 종료 -> main 스레드가 end까지 실행 -> 자바 종료
        //10초 기다리지 않고 main 스레드 종료 해버림
    }

    //Thread의 보조적 역할
    static class DemonThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread.currentThread().getName()" + " : run() start");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread.currentThread().getName()" + " : run() end");
        }
    }
}
