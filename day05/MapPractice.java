package day05;
import java.util.*;
public class MapPractice {
    public static void main(String[] args) {

        HashMap<String, String> hashmap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        // ArrayList 삽입 : add
        // ArrayList 삭제 : remove
        // ArrayList 추출 : get

        System.out.println("몇번 넣고 싶어요 ?");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("키를 입력해주세요.");
            String key = scanner.next();

            System.out.println("값을 입력해주세요.");
            String value = scanner.next();
            hashmap.put(key + "은", value);
        }
        System.out.println(hashmap);
    }
}