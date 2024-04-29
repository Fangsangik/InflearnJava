package chap30.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data){
        String address = "http://ex.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
