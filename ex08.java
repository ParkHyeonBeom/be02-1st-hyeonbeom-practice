public class ex08 {
    public static void main(String[] args) {
        int lotto[] = new int[6];	// 로또 번호를 입력받을 배열을 선언해준다.
        System.out.print("로또 번호 : ");
        for(int i = 0; i < lotto.length; i++)
        {
            lotto[i] = (int)(Math.random() * 45) + 1; // 1~45까지의 임의의 수를 받는다.
            for(int j = 0; j < i; j++)
            {	// 중복된 번호가 있으면 이전 포문으로 돌아가 다시 시행한다.
                if(lotto[i] == lotto[j])
                {
                    i--;
                }
            }
            System.out.print(lotto[i] + " ");	// 로또번호를 출력한다.
        }

    }
}
		