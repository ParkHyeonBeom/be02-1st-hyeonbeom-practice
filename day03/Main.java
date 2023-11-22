package day03;

public class Main {
    public static void main(String[] args) {
        Student phb;
        phb = new Student();

        phb.intelligence=0;
        phb.fullness=10;
        phb.age=25;
        phb.gender="남자";
        phb.name="박현범";

        int result = phb.studying("자료구조",2);
        int result2 = phb.eating("빵",15);

    }
}
