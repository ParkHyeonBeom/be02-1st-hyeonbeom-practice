package Ex1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Message extends Thread {
    Socket socket;

    public Message(Socket socket)
    {
        this.socket = socket;
    }

    public void run()
    {
        try {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bir = new BufferedReader(isr);
            while (true) {
                String data = bir.readLine();
                System.out.println(data);
                for (int i = 0; i < Server.socketList.size(); i++) {
                    Socket client = Server.socketList.get(i);
                    OutputStream os = client.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(os);
                    BufferedWriter bw = new BufferedWriter(osw);
                    bw.write(data + "\n");
                    bw.flush();
                }
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
