import java.util.*;
public class ex07{
    public static void main(String[] args) {
        int unit[] = {50000,10000,1000,500,100,50,10,1};
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int x = a/unit[0];
        int x2 = a%unit[0];
        System.out.println(x+"개");

        int x3 = x2/unit[1];
        int x4 = x2%unit[1];
        System.out.println(x3+"개");

        int x5 = x4/unit[2];
        int x6 = x4%unit[2];
        System.out.println(x5+"개");

        int x7 = x6/unit[3];
        int x8 = x6%unit[3];
        System.out.println(x7+"개");

        int x9 = x8/unit[4];
        int x10 = x8%unit[4];
        System.out.println(x9+"개");

        int x11 = x10/unit[5];
        int x12 = x10%unit[5];
        System.out.println(x11+"개");

        int x13 = x12/unit[6];
        int x14 = x12%unit[6];
        System.out.println(x13+"개");

        int x15 = x14/unit[7];
        int x16 = x14%unit[7];
        System.out.println(x15+"개");
    }
}

