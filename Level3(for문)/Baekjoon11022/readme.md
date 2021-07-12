Baekjoon11022 A +B -8
=====
[Baekjoon11022](https://www.acmicpc.net/problem/11022)
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loop = scan.nextInt();
        for(int i=1;i<=loop;i++){
            int inputNum1 = scan.nextInt();
            int inputNum2 = scan.nextInt();
            int result = inputNum1+inputNum2;
            System.out.println("Case #"+i+": "+ inputNum1 + " + "+ inputNum2 +" = "+result);
        }
        scan.close();
    }
    
}
```
1.int loop = scan.nextInt();는 사용자에게 몇번 반복할지 scanner를 통해서 nextInt()로 받아서 loop 변수에 집어넣는다. 
2.int i가 loop만큼 반복해준다. 
3.inputNum1 , inputNum2으로 사용자에게 더해줄 값을 입력받아 변수에 넣어준다. 
4.int result변수에 inputNum1 , inputNum2 을 더해준 값을 result에 저장해준다. 
5.그후 println함수를 통해서 출력해줌

