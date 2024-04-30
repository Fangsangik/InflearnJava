package chap31.ex2;

public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://ex.com";

        NetworkClientV2 clientV2 = new NetworkClientV2(data);
        clientV2.initError(data);

        clientV2.connect();
        clientV2.send(data);
        clientV2.disconnect();
    }
}
