package chap41.controller;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception { // main은 밖으로 던질 수 있다
        //throw new Exception();
    }

    static class CheckedRunnable implements Runnable { // run은 체크 예외를 밖으로 던질 수 없다.

        @Override
        public void run() {
            //throw new Exception();
        }
    }
}
