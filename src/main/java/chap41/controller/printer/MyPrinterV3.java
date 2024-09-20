package chap41.controller.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static chap41.util.MyLogger.log;

public class MyPrinterV3 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread printerThread = new Thread(printer, "printer");
        printerThread.start();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("프린터할 문서를 입력하세요, 종료 (q) : ");
            String input = sc.nextLine();
            if (input.equals("q")) {
                //printer.work = false;
                printerThread.interrupt();
                break;
            }
            printer.addJob(input);
        }
    }

    //main 스레드가 넣어주는 것
    static class Printer implements Runnable {
        Queue<String> queue = new ConcurrentLinkedQueue<>(); //여러 스레드가 돌아가는 경우 Concurrent가 들어있어야 한다.

        public void run() {
            while (!Thread.interrupted()) {
                if (queue.isEmpty()) {
                    continue;
                }

                try {
                    String job = queue.poll();
                    log("출력 시작 : " + job + " 대기 문서: " + queue);
                    Thread.sleep(3000);
                    log("출력 완료 : " + job);
                } catch (InterruptedException e) {
                    log("인터럽트");
                    break;
                }
            }
            log("프린터 종료");
        }

        public void addJob(String input) {
            queue.offer(input);
        }
    }
}
