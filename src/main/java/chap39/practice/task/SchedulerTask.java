package chap39.practice.task;

public class SchedulerTask {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.add(new CompressionTask());
        scheduler.add(new BackupTask());
        scheduler.add(new CleanTask());

        System.out.println("작업 시작");
        run(scheduler);
        System.out.println("작업 완료");
    }

    private static void run(TaskScheduler scheduler) {
        while (scheduler.getRemainingTask() > 0) {
            scheduler.processNextTask();
        }
    }
}
