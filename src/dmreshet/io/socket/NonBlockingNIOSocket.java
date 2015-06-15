package dmreshet.io.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NonBlockingNIOSocket {

    private static byte[] data = new byte[255];

    public static void main(String[] args) throws IOException, IOException, InterruptedException {
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        SocketAddress port = new InetSocketAddress("127.0.0.1", 7777);
        serverChannel.socket().bind(port);
//        serverChannel.configureBlocking(false);

        while (true) {
            SocketChannel clientChannel = serverChannel.accept();
            if (clientChannel == null) {
                Thread.sleep(100);
                System.out.println("Waiting...");
            } else {
                String response = "Hello " + clientChannel.socket().getInetAddress() + " on port "
                        + clientChannel.socket().getPort() + "\r\n";
                response += "This is " + serverChannel.socket() + " on port "
                        + serverChannel.socket().getLocalPort() + "\r\n";

                byte[] data = response.getBytes("UTF-8");
                ByteBuffer buffer = ByteBuffer.wrap(data);
                while (buffer.hasRemaining())
                    clientChannel.write(buffer);
                clientChannel.close();
            }
        }
    }
}
