package chap31.ex4;

public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "http://ex.com";

        NetworkClientV4 client = new NetworkClientV4(data);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
