package chap56.network.tcp.v2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static chap56.util.MyLogger.log;

public class ServerV2 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("Server started");
        ServerSocket serverSocket = new ServerSocket(PORT); //12345 포트가 떠있음
        log("Server socket created: " + PORT);

        Socket socket = serverSocket.accept(); // 12345 포트로 들어오면 갖고 socket을 만들어줌
        log("Client connected: " + socket);
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());


        while (true) {
            // 클라이언트로부터 메시지 수신 (서버입장에서는 받는 입장)
            String received = input.readUTF(); // 여기서 여러 스레드를 만들어서 돌려야 여러명 접속해더라도 각 스레드 마다 할당해서 작동
            log("client -> server: " + received);

            if (received.equalsIgnoreCase("exit")) {
                break;
            }

            String toSend = received + " World!";
            output.writeUTF(toSend);
            log("server -> client: " + toSend);
        }
        // 자원 정리
        log("연결 종료: " + socket);
        input.close();
        output.close();
        socket.close();
        serverSocket.close();
    }
}

/**
 * Task :chap56.network.tcp.v1.ServerV1.main()
 * 20:52:32.54 [     main] Server started
 * 20:52:32.54 [     main] Server socket created: 12345
 * 20:52:40.97 [     main] Client connected: Socket[addr=/127.0.0.1,port=52307,localport=12345] port 52307에 연결 되어 있음
 * 20:52:40.97 [     main] client -> server: Hello!
 * 20:52:40.97 [     main] server -> client: Hello! Hello, Client!
 * 20:52:40.97 [     main] 연결 종료: Socket[addr=/127.0.0.1,port=52307,localport=12345]

 * 서로 통신 하기 위해서는 IP & PORT가 필요하다. 클라이언트가 접근을 할때 남는 Port 하나 할당
 */