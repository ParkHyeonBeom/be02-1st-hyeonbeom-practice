package day04.package4.;

import java.util.Scanner;

public class MainT {
    public static void main(String[] args) {
        PlayerT[] players = new PlayerT[2];
        players[0] = new PlayerT("플레이어1");
        players[1] = new PlayerT("플레이어2");

        Scanner sc = new Scanner(System.in);

        int select;
        while (players[0].getHeart() > 0 || players[1].getHeart()>0) {
            for (int i = 0; i < 2; i++) {
                int lotto[] = new int[3];
                for (int idx = 0; idx < lotto.length; idx++) {
                    lotto[idx] = (int) (Math.random() * 3) + 1;
                }

                boolean flag = true;
                while (flag) {
                    flag = false;
                    for (int idx = 0; idx < 3; idx++) {
                        for (int jdx = idx + 1; jdx < 3; jdx++) {
                            if (lotto[idx] == lotto[jdx]) {
                                lotto[idx] = (int) (Math.random() * 3) + 1;
                                idx = 0;
                                flag = true;
                            }
                        }
                    }
                }

                for (int idx = 0; idx < 3; idx++) {
                    System.out.print(" " + lotto[idx]);
                }
                System.out.println();


                System.out.print(players[i].getName());
                System.out.print("님아 ");
                System.out.print(" 1 2 3 중 하나를 입력하세요 : ");
                select = sc.nextInt();
                select = select - 1;
                if(lotto[select] == 1) {
                    players[i].jeongdap();
                    if(players[i].getScore() ==3) {
                        System.out.println("이겼땅!");
                        System.exit(0);
                    }
                } else if(lotto[select] == 2) {
                    players[i].kkoang();
                } else if(lotto[select] == 3) {
                    players[i].poktan();
                }

            }


        }
    }
}
