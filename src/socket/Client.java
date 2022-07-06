package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;

    public Client() {

        try {
            System.out.println("正在链接服务器");
            socket = new Socket("localhost", 8088);
            System.out.println("与服务端建立链接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            SeverHandler severHandler = new SeverHandler();
            Thread t = new Thread(severHandler);
            t.setDaemon(true);
            t.start();

            OutputStream out = socket.getOutputStream();
            OutputStreamWriter ows = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(ows);
            PrintWriter pw = new PrintWriter(bw, true);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String line = scanner.nextLine();
                if ("exit".equals(line)) {
                    pw.println("拜拜");
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    private class SeverHandler implements Runnable{
        @Override
        public void run() {
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {

            }
        }
    }
}
