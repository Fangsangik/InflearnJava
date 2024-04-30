package chap31.ex3;

public class SendExceptionV3 extends NetworkClientExceptionV3{
    public final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
