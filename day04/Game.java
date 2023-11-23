package day04;
import day04.package3.Card;
import day04.package4.PlayerT;

import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차의 수 입력");
        int people = sc.nextInt();

        Car car[] = new Car[people];

        System.out.println("경주할 자동차 이름을 입력");
        for (int i = 0; i < people; i++) {
            String name = sc.next();
            car[i] = new Car(name);
            car[i].setName(name);
        }

        System.out.println("시도할 횟수");
        int chance = sc.nextInt();

        System.out.println("실행결과");
        for (int i = 0; i < chance; i++) {
            for (int j = 0; j < people; j++) {
                int a = (int) (Math.random() * 10);
                System.out.print(car[j].name + " : ");
                if (a >= 4)
                    car[j].move();
                else
                    car[j].result();
            }
            System.out.println();
        }
    }
}



