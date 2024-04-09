package chap21.practice;

public class EmailSender implements Message {
    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다 " + message);
    }
}
