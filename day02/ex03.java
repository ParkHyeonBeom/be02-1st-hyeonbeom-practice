package day02;

import java.util.*;
public class ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array[] = new int[6];

        for(int i=0 ; i<6 ; i++)
        {
            array[i] = scanner.nextInt();
        }

        for(int i=5 ; i>=0 ; i--)
        {
            System.out.println(array[i]);
        }
    }
}
