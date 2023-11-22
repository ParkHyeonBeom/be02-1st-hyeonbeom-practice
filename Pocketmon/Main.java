package Pocketmon;

public class Main {
    public static void main(String[] args) {
        Pocketmon p1 = new Pocketmon(0,0,"피카츄",100,0,70,1);
        Pocketmon p2 = new Pocketmon(0,0,"라이츄",110,0,77,1);
        FlyingPocketmon f1 = new FlyingPocketmon(0,0,"피죤투",100,0,70,1,0);
        FlyingPocketmon f2 = new FlyingPocketmon(0,0,"또가스",100,0,0,1,0);

        System.out.println("피카츄가 라이츄를 공격합니다..");
        p1.attack(p2);
        System.out.println("라이츄의 체력은 "+p2.hp);
        System.out.println("");


        System.out.println("피죤트의 현재고도는 : "+f1.z+" 입니다.");
        System.out.println("");
        System.out.println("피죤트가 비행합니다.");
        f1.fly(50);
        System.out.println("피죤트의 현재고도는 : "+f1.z+" 입니다.");
        System.out.println("");
        System.out.println("피죤트가 착륙합니다.");
        f1.landing();
        System.out.println("피죤트의 현재고도는 : "+f1.z+" 입니다.");
        System.out.println("");
        System.out.println("피카츄가 라이츄와 맞장을깝니다.");
        p1.getExp("포켓몬");
        System.out.println("피카츄의 레벨은 " + p1.level + " 입니다.");
    }
}
