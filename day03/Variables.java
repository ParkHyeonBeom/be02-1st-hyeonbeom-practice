package day03;

public class Variables {
    // 객체 = 인스턴스 변수
    // 클래스 안에 만들어지고, 객체가 생성될 때 생성
    // 객체가 저장된 변수가 없을 때 삭제 <- GC(가비지컬렉터)가 삭제
    Integer num = 20;
    void method(){
        // 지역 변수
        // 메소드 안에서  만들어지고, 메소드가 실행될 때 생성
        // 메소드가 끝날 때 변수도 같이 삭제
        Integer num;
        num = 10;

        System.out.println(this.num);
    }
}
