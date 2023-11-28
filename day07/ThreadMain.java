package day07;

public class ThreadMain {
    public static void main(String[] args) {
        // 스레드 객체 생성
        Thread thread01 = new Thread01();
        // start() 메소드로 스레드 시작, 시작시키면 스레드에 있는 run() 메소드가 실행됨
        thread01.start();

        for (int i = 0; i < 10000; i++)
        {
            System.out.println("메인 스레드에서 실행 : " + i);
        }
    }
}
