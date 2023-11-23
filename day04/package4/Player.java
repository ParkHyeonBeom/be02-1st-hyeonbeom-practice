package day04.package4;
import java.util.*;
public class Player {

    int heart=5;
    static int score;

    public Player() {
    }

    int answer()
    {
        System.out.println("점수를 1점 증가시켰습니다.");
        score = score + 1;
        return score;
    }
    int wrong()
    {
        System.out.println("플레이어의 하트를 감소시켰습니다.");
        heart = heart - 1;
        return heart;
    }

    void bomb()
    {
        System.out.println("점수를 1점 감소시키고, 플레이어의 하트를 감소시켰습니다.");
        score = score -1;
        heart = heart -1;
        System.out.println("플레이어의 점수는 " + score + " 하트는 " + heart + " 입니다.");
    }



    }


