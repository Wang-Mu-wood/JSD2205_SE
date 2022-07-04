package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    private ServerSocket serverSocket;
    public Server(){

        try {
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start(){
        try {

            while (true) {

                System.out.println("等待客户端链接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端链接了");

                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line = br.readLine()) != null) {

                    System.out.println("客户端说：" + line);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
