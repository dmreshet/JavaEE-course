package dmreshet.io.socket.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;


public class NioSServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        serverSocketChannel.socket().bind(new InetSocketAddress("localhost", 7777));
        serverSocketChannel.configureBlocking(false);
        SocketChannel socketChannel = null;
        while (true) {
            if (socketChannel != null) {
                socketChannel.configureBlocking(false);

                ByteBuffer buffer = ByteBuffer.allocate(10);
                while (socketChannel.read(buffer) > 0) {
                    buffer.flip();
                    for (int i = 0; i < buffer.limit(); i++) {
                        System.out.println((char) buffer.get());
                    }
                    buffer.clear(); // do something with the data and clear/compact it.
                }
            } else {
                socketChannel = serverSocketChannel.accept();
                Thread.sleep(1000);
                System.out.println("Waiting for Client");
                continue;
            }


        }


    }
}
