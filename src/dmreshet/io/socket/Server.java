package dmreshet.io.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    private ServerSocket server;
    private int port;

    public static void main(String[] args) {
        Server s;

        try {
            s = new Server(7777);
            System.out.println("Server is created.");
            s.workWithClient();
        } catch (IOException ex) {
            System.out.println("Error!");
        }
    }

    public Server(int port) throws IOException {
        this.port = port;
        server = new ServerSocket(port);
    }

    public void workWithClient() throws IOException {
        System.out.println("Waiting for a client...");
        Socket client = server.accept();

        int inputData = 0;
        while ((inputData = client.getInputStream().read()) != -1) {
            System.out.println(inputData + " " + System.currentTimeMillis());

            System.out.println("\nSending...");
            client.getOutputStream().write(inputData);
        }
        client.getOutputStream().flush();

        client.close();


        System.out.println("\nWork is complete!");
    }
}
