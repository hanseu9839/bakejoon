import java.util.Scanner;

/*
1. Scanner , OX를 담을 배열이 필요함
2. OOXXOXXOOO 이런식으로 되어있는것을 연속된 값을 더해줄 cnt 가 필요함
3. 합 변수가 필요함 
4. for문을 통해서 OXOX를 넣어준다. 
5. if문을 통해서 OX인지 판단해주어 더해준다. 
*/
public class baekjoon8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nArray = sc.nextInt();
        int cnt;
        int sum;
        String[] array = new String[nArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }
        for (int j = 0; j < array.length; j++) {
            sum = 0;
            cnt = 0;
            for (int i = 0; i < array[j].length(); i++) {
                if (array[j].charAt(i) != 'X')
                    cnt++;
                else
                    cnt = 0;
                sum += cnt;
            }
            System.out.println(sum);
        }

        sc.close();
    }
}
