Baekjoon8483 합 구하기 
====
[Baekjoon8483]https://www.acmicpc.net/problem/8393)
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int sum =0;
        for(int i=1; i<=max;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
```
1.사용자가 더해줄 max값을 사용자에게 입력받고 
2.for문을 통해서 반복문으로 돌려준다. 
3.sum을 이용해서 출력시켜준다. 