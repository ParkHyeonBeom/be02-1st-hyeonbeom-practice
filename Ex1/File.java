package Ex1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class File extends Thread {
    Socket socket;

    public File(Socket socket)
    {
        this.socket = socket;
    }

    public void run()
    {
        try
        {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bir = new BufferedReader(isr);
            String filename = bir.readLine();
            System.out.println(filename);
            // 여기까지 받는 코드
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            FileInputStream fis = new FileInputStream("c:\\test\\"+filename);
            int data = 0;
            while( (data = fis.read()) != -1)
            {
                bos.write(data);
            }

            bos.close();
            bir.close();
            socket.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
