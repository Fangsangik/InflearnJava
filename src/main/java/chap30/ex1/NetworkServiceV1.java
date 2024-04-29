package chap30.ex1;

public class NetworkServiceV1 {

    public void sendMessage(String data){
        String address = "http://ex.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
