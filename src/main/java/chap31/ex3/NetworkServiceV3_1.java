package chap31.ex3;

import chap31.ex2.NetworkClientExceptionV2;
import chap31.ex2.NetworkClientV2;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address = "http://ex.com";

        NetworkClientV3 client = new NetworkClientV3(data);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 코드 " + e.getAddress() + " , 메시지 " + e.getMessage());
        }catch (SendExceptionV3 e){
            System.out.println("[전송 오류] 코드 " + e.getSendData() + " , 메시지 " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
