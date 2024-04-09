package chap21.practice;

public class SendMain {
    public static void main(String[] args) {
        Message[] message = {new EmailSender(), new FaceBookSender(), new SmsSender()};

        for (Message m : message) {
            m.sendMessage("환영합니다.");
        }
    }
}
