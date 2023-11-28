package day06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
// 양방향 1회통신 , 클라이언트가 먼처 입력 후 서버가 후 입력
public class ServerChatMain {
    public static void main(String[] args) {
        try {
            // 포트를 LISTEN 상태로 변경
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket clientSocket = serverSocket.accept();
            System.out.println(clientSocket.getInetAddress()+"와 접속되었습니다.");

            // 입력받는거
            InputStream is = clientSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String data = br.readLine();
            System.out.println(data);


            // 보내는거
            OutputStream os = clientSocket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bow = new BufferedWriter(osw);
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();

            bow.write(text+"\n");
            bow.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
