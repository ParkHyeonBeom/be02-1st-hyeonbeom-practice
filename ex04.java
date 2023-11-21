import java.util.Scanner;
public class ex04{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int array[] = new int[10];
            int sum=0;
            for(int i=0 ; i<10 ; i++)
            {
                array[i] = scanner.nextInt();
                if (array[i]>0)
                {
                 sum=sum+array[i];
                }
                else
                    break;
            }
            System.out.println(sum/array.length);
        }
    }

