package chap56.network.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static chap56.util.MyLogger.log;

public class ClientV1 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("Client started");
        Socket socket = new Socket("localhost", PORT);
        // 외부에 데이터 받을 수 있고
        DataInputStream input = new DataInputStream(socket.getInputStream()); // 보조 스트림 사용 socket.getInputStream()
        // 외부에 데이터를 보낼 수 있고
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        log("socket connected" + socket);

        // 서버로부터 메시지 송신
        String toSend = "Hello! ";
        output.writeUTF(toSend);
        log("client -> server: " + toSend);

        // 서버로부터 메시지 수신
        String received = input.readUTF();
        log("server -> client: " + received);

        // 자원 정리
        log("연결 종료: " + socket);
        input.close();
        output.close();
        socket.close();
    }
}

/**
 * 20:51:48.05 [     main] Client started
 * 20:51:48.06 [     main] socket connectedSocket[addr=localhost/127.0.0.1,port=12345,localport=52296]
 * 20:51:48.06 [     main] client -> server: Hello!
 * 20:51:48.07 [     main] server -> client: Hello! Hello, Client!
 * 20:51:48.07 [     main] 연결 종료: Socket[addr=localhost/127.0.0.1,port=12345,localport=52296]
 *
 * port=12345,localport=52296 : 12345 포트로 접속을 했고, 52296 포트로 접속을 받았다.
 *
 * 127.0.0.1 : loopback address
 */