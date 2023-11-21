import java.util.*;
public class ex08{
    public static void main(String[] args) {
        int lotto[] = new int[6];

        for(int i=0; i<lotto.length;i++)
        {
            lotto[i] = (int)(Math.random()*6)+1;
            for(int j=0 ; j<i ; j++)
            {
                if(lotto[i] == lotto[j])
                    i--;
            }
        }

        for(int i=0; i<lotto.length;i++)
            System.out.println(lotto[i]);
    }
}

