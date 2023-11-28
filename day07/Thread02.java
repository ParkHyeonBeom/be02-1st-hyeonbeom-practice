package day07;

public class Thread02 implements Runnable{
    @Override
    public void run()
    {
        for (int i = 0; i < 10000; i++)
        {
            System.out.println("메인 스레드에서 실행 : " + i);
        }
    }
    public static void main(String[] args)
    {

    }
}
