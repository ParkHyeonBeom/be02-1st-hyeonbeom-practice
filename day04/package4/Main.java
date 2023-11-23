package day04.package4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[4];
        Player p1 = new Player();
        Player p2 = new Player();

        System.out.println("게임시작");

        while(p1.heart > 0 || p2.heart > 0)
        {
            if(p1.score >=3)
                break;
            else if(p1.heart>0 && p2.heart>0)
            {
                for (int i = 1; i < 4; i++) {
                    array[i] = (int) (Math.random() * 3) + 1;
                    for (int j = 1; j < i; j++)
                        if (array[i] == array[j]) {
                            i--;
                        }
                }
                System.out.println("플레이어 1은 숫자를 입력해주세요.");
                int a = scanner.nextInt();
                if (array[a] == 1) {
                    p1.answer();
                    System.out.println("플레이어 1의 점수는 : " + p1.score + " 입니다.");
                } else if (array[a] == 2) {
                    p1.wrong();
                    System.out.println("플레이어 1의 하트 갯수는 " + p1.heart + " 입니다.");
                } else
                    p1.bomb();


                for (int i = 1; i < 4; i++) {
                    array[i] = (int) (Math.random() * 3) + 1;
                    for (int j = 1; j < i; j++)
                        if (array[i] == array[j]) {
                            i--;
                        }
                }

                System.out.println("플레이어 2는 숫자를 입력해주세요.");
                int b = scanner.nextInt();
                if (array[b] == 1) {
                    p2.answer();
                    System.out.println("플레이어 2의 점수는 : " + p2.score + " 입니다.");
                } else if (array[b] == 2) {
                    p2.wrong();
                    System.out.println("플레이어 2의 하트 갯수는 " + p2.heart + " 입니다.");
                } else
                    p2.bomb();
            }
            else if(p1.heart==0)
            {
                System.out.println("플레이어 2는 숫자를 입력해주세요.");
                int b = scanner.nextInt();
                if (array[b] == 1) {
                    p2.answer();
                    System.out.println("플레이어 2의 점수는 : " + p2.score + " 입니다.");
                } else if (array[b] == 2) {
                    p2.wrong();
                    System.out.println("플레이어 2의 하트 갯수는 " + p2.heart + " 입니다.");
                } else
                    p2.bomb();
            }
            else if(p2.heart==0)
            {

                System.out.println("플레이어 2는 숫자를 입력해주세요.");
                int a = scanner.nextInt();
                if (array[a] == 1) {
                    p1.answer();
                    System.out.println("플레이어 2의 점수는 : " + p1.score + " 입니다.");
                } else if (array[a] == 2) {
                    p1.wrong();
                    System.out.println("플레이어 2의 하트 갯수는 " + p1.heart + " 입니다.");
                } else
                    p1.bomb();
            }
        }
    }
}
