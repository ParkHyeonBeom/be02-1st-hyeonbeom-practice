package day03;

import java.util.Arrays;

public class Champion {
    String name;
    Integer attackDamage;
    Integer attackRange;
    Integer hp;
    Integer defence;
    Integer level;
    Integer exp;
    Integer x;
    Integer y;
    String[] itemList;


    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                ", attackDamage=" + attackDamage +
                ", attackRange=" + attackRange +
                ", hp=" + hp +
                ", defence=" + defence +
                ", level=" + level +
                ", exp=" + exp +
                ", x=" + x +
                ", y=" + y +
                ", itemList=" + Arrays.toString(itemList) +
                '}';
    }

    // Alt + Insert 키를 누르면 개발 도구를 통해 자동으로 여러 메소드 생성 가능
    // Constructor가 생성자
    // 변수를 선택해서 생성자를 만들면 객체를 생성하면서 실행하는 생성자를 통해
    // 매개변수로 값을 전달 받고 전달받은 값으로 객체의 변수들을 초기화할 수 있다.
    public Champion(String name, Integer attackDamage, Integer attackRange, Integer hp, Integer defence, Integer level, Integer exp, Integer x, Integer y, String[] itemList) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.attackRange = attackRange;
        this.hp = hp;
        this.defence = defence;
        this.level = level;
        this.exp = exp;
        this.x = x;
        this.y = y;
        this.itemList = itemList;
        for (int i=0; i<this.itemList.length; i++) {
            this.itemList[i] = "빈칸";
        }
    }

    // 메소드 오버로딩
    // 똑같은 이름의 메소드를 여러개 만드는 것. 단, 매개변수 수나 매개변수의 타입이 달라야한다.
    // 메소드를 사용하는 쪽에게 여러 사용 방법을 제공해주는 것

    Champion(String name){
        this.name = name;
    }

    Champion(Integer hp){
        this.hp = hp;
    }

    void recall(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    void recall(){
        this.x = 0;
        this.y = 0;
    }

    String[] shopping(String item) {
        for (int i=0; i<this.itemList.length; i++) {
            if(this.itemList[i] == "빈칸") {
                this.itemList[i] = item;
                break;
            }
        }

        return itemList;
    }

    void die() {
        this.recall();
        this.hp = 100;
    }

    Integer attacked(Integer attackDamage) {
        this.hp = this.hp - attackDamage;
        return hp;
    }
    Integer attacked(Integer attackDamage,int a) {
        this.hp = this.hp - a*attackDamage;
        if(hp <= 0) {
            this.die();
        }
        return hp;
    }
    // attacked 메소드를 오버로딩을 이용해서
    // 숫자를 하나 더 전달받는 메소드를 만든다

    void attackTo(Champion target) {
        // 1부터 100 사이의 랜덤 숫자를 생성
        // 만약에 90 이상이면
        //      3배 크리티컬 공격
        // 그렇지 않고 만약에 80 이상이면
        //      2배 크리티컬 공격
        // 그렇지 않으면
        //      그냥 공격
        int a = (int)(Math.random()*100+1);
        if(a>=90)
            target.attacked(this.attackDamage,3);
        else if(a>=80)
            target.attacked(this.attackDamage,2);
        else
        target.attacked(this.attackDamage);
    }

    // 이동
    void move(Integer x, Integer y) {
        // 전달 받은 매개변수 x를 객체의 x에 저장
        this.x = x;
        // 전달 받은 매개변수 y를 객체의 y에 저장
        this.y = y;
    }

    Integer levelUp() {
        // 레벨 1증가
        level = level + 1;
        // 공격 데미지 10% 증가
        attackDamage = attackDamage * 110 / 100;
        // 방어력 5% 증가
        defence = defence * 105 / 100;
        // 체력 20% 증가
        hp = hp * 120 / 100;

        // 현재 레벨 반환
        return level;
    }

    Integer expUp(String enemy){
        // 만약에 미니언 잡았으면 경험치 10증가
        // 그렇지 않고 만약에 용 잡았으면 경험치 50증가
        // 그렇지 않고 만약에 타워 잡았으면 경험치 100증가
        if(enemy == "미니언") {
            exp = exp + 10;
        } else if(enemy == "용") {
            exp = exp + 50;
        } else if(enemy == "타워") {
            exp = exp + 100;
        }

        // 경험치가 100보다 크거나 같으면 레벨업 하고 경험치를 100으로 나눈 나머지로 설정
        if(exp >= 100) {
            this.levelUp();
            exp = exp % 100;
        }

        // 경험치 반환
        return exp;
    }


}
