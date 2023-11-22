package day02;

import java.util.*;
public class ex06{
    public static void main(String[] args) {
        String input[]  = {"일","월","화","수","목","금","토"};

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a>=0 && a<=6)
        System.out.println(input[a]);

        else
            System.out.println("잘못된 입력");
    }
}

