public class ex05{
    public static void main(String[] args) {
        int [] input = new int[10];
        int sum=0;
        for(int i=0 ; i<10 ; i++)
        {
            input[i] = (int)(Math.random() * 10)+1;
            System.out.println(input[i]);
            sum=sum+input[i];
        }
        System.out.println(sum);
    }
}

