package chap31.ex4;

public class SendExceptionV4 extends NetworkClientExceptionV4{
    public final String sendData;

    public SendExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
