package chap39.practice.task;

public class BackupTask implements Task{
    @Override
    public void execute() {
        System.out.println("자료 백업... ");
    }
}
