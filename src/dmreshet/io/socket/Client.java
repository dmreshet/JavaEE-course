package dmreshet.io.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    private Socket socket = new Socket();

    public static void main(String[] args) throws IOException, InterruptedException {
        Client client = new Client();
        client.socket.connect(new InetSocketAddress("localhost", 7777));
//        for (int i = 0; i < 10; i++) {
//            client.socket.getOutputStream().write(60+i);
//        }
//
//        Thread.sleep(5000);
//        for (int i = 0; i < 10; i++) {
//            client.socket.getOutputStream().write(30 + i);
//        }
//        client.socket.close();
//        client.socket.getOutputStream().close();
        int i = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(client.socket.getInputStream()));
        while (br.ready()){
            System.out.print(br.readLine());
        }
        br.close();
    }
}
