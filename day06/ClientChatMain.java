package day06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientChatMain {
    public static void main(String[] args) {

        try {
            // 서버로 접속하는 코드
            Socket clientSocket = new Socket("192.168.0.213", 9999);

            // 보내는거
            OutputStream os = clientSocket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bow = new BufferedWriter(osw);

            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();

            bow.write(text+"\n");
            bow.flush();

            // 입력받는거
            InputStream is = clientSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine();
            System.out.println(data);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}