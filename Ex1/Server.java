package Ex1;
import day07.Thread01;

import java.io.*;
import java.net.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
    static List<Socket> socketList = new ArrayList<Socket>();
    public static void main(String[] args)
    {
        int port = 7777; // 포트번호
        try
        {
            ServerSocket serverSocket = new ServerSocket(port); // 서버 실행
            while(true)
            {
                Socket cs = serverSocket.accept();
                socketList.add(cs);
                Thread message = new Message(cs);
                // start() 메소드로 스레드 시작, 시작시키면 스레드에 있는 run() 메소드가 실행됨
                message.start();
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}