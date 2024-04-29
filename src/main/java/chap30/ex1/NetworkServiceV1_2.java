package chap30.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data){
        String address = "http://ex.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectRst = client.connect();
        if (isError(connectRst)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 " + connectRst);
            return;
        }

        String sendRst = client.send(data);
        if (isError(sendRst)){
            System.out.println("[네트워크 오류 발생] 오류 코드 " + sendRst);
            return;
        }

        client.disconnect();
    }

    public static boolean isError(String rstCode){
        return !rstCode.equals("success");
    }
}
