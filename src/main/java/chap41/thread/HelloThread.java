package chap41.thread;

public class HelloThread extends Thread {
    @Override
    public void run() {
        //main 스레드는 main 메서드 스택 프레임에 스택을 올리면서 시작
        //직접 만드는 스레드는 run 메서드의 스택 프레임을 스택에 올리면서 시작
        //main은 단지 지시만 할 뿐
        System.out.println(Thread.currentThread().getName() + " : run()");
        //currentThread -> 해당 스레드 객체 조회 가ㅡㄴㅇ
        //.getName -> 이름 조회
    }
}
