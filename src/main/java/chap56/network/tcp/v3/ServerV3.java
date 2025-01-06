package chap56.network.tcp.v3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static chap56.util.MyLogger.log;

public class ServerV3 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("Server started");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("Server socket created: " + PORT);

        while (true) {
            Socket socket = serverSocket.accept(); //블로킹
            log("Client connected: " + socket);

            //실제 하나랑 통신하는 것은 SessionV3 처리
            SessionV3 session = new SessionV3(socket);
            //별도 스레드로 처리
            Thread thread = new Thread(session);
            thread.start();
        }
    }
}

/**
 * > Task :chap56.network.tcp.v3.ServerV3.main()
 * 22:20:58.27 [     main] Server started
 * 22:20:58.27 [     main] Server socket created: 12345
 * 22:21:07.37 [     main] Client connected: Socket[addr=/127.0.0.1,port=53026,localport=12345]
 * 22:21:17.67 [     main] Client connected: Socket[addr=/127.0.0.1,port=53030,localport=12345]
 * 22:21:26.39 [ Thread-0] client -> server: fuck u
 * 22:21:26.39 [ Thread-0] server -> client: fuck u World!
 * 22:21:32.68 [ Thread-1] client -> server: fuck u
 * 22:21:32.68 [ Thread-1] server -> client: fuck u  World!
 *
 * 각각의 스레드가 따로따로 처리
 */
