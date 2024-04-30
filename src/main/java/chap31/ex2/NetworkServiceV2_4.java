package chap31.ex2;

public class NetworkServiceV2_4 {
    public void sendMessage(String data) {
        String address = "http://ex.com";

        NetworkClientV2 clientV2 = new NetworkClientV2(data);
        clientV2.initError(data);

        try {
            clientV2.connect();
            clientV2.send(data);

        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 " + e.getErrorCode() + " , 메시지 " + e.getMessage());
        }

        //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져져 무시
        clientV2.disconnect();
    }
}
