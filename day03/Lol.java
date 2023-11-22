package day03;

public class Lol {
    public static void main(String[] args) {
        System.out.println("챔피언 객체 생성 전");
        Champion garen = new Champion(
                "가렌",
                72,
                100,
                580,
                60,
                1,
                0,
                0,
                0,
                new String[6]
        );
        System.out.println("챔피언 객체 생성 후");
        System.out.println(garen.hp);

        System.out.println("챔피언 객체 생성 전");
        Champion darius = new Champion(
                "다리우스",
                64,
                175,
                652,
                39,
                1,
                0,
                0,
                0,
                new String[6]
        );
        System.out.println("챔피언 객체 생성 후");
        System.out.println(darius.hp);


        // 다리우스가 가렌을 공격한다.
        // 현재 가렌의 체력 출력
        darius.attackTo(garen);
        System.out.println(garen.hp);

        // 내가 하나하나 다 확인하기 너무 귀찮음
        System.out.println(darius.name + " " + darius.hp);

        System.out.println(darius.toString());

        Champion jinx = new Champion("징크스");

        Champion katalina = new Champion(400);
    }
}
