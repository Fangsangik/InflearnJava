package chap21.practice;

public class SmsSender implements Message{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다 " + message);
    }
}
