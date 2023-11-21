import java.util.*;
public class ex08 {
    public static void main(String[] args) {

        int num[] = new int[6];

        for (int i = 0; i < 6; i++) {
            num[i] = (int) (Math.random() * 6) + 1;
        }

        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j <6; j++) {
                if (num[i] == num[j])
                    while(true)
                    {
                        num[i] = (int) (Math.random() * 6) + 1;
                        if (num[i] != num[j])
                            break;
                    }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(num[i]);
        }
    }
}