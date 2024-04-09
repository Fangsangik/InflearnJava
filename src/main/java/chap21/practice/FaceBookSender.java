package chap21.practice;

public class FaceBookSender implements Message{
    @Override
    public void sendMessage(String message) {
        System.out.println("페메를 보냅니다 " + message);
    }
}
