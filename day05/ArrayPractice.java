package day05;
import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        // 나중에 문법 더 배우고 쓸 형태
        // 리스트가 뭐죠 ? 자동으로 늘어나고 줄어드는 배열
        List<String> arrayList = new ArrayList<String>();

        // 리스트에 값을 추가하는 법
        arrayList.add("박현범");
        System.out.println("arrayList = " + arrayList); // soutv
        arrayList.add("백송연");
        arrayList.add("김갱미");
        arrayList.add("임연진");
        arrayList.add("강문혜");
        arrayList.add("강지흔");
        System.out.println(arrayList);

        System.out.println(arrayList); //ArrayList는 클래스의 형태 싱관없이 다 입력 O

        arrayList.remove(0); // remove라는 메소드를 인덱스를 입력하여 이용
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.remove("김갱미"); // remove라는 메소드를 객체를 입력하여 이용
        System.out.println(arrayList);

        arrayList.add(0,"박현범"); // add라는 메소드를 인덱스와 객체를 입력하여 이용
        System.out.println(arrayList);

        String a = arrayList.get(1); // String 클래스를 통해 만든 변수 a 에다가 arrayList의 1번 인덱
                                    //   스에 있는 객체를 넣게쏘요
        System.out.println(a);

    }
}



