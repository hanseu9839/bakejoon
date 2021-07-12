Baekjoon2438 별찍기 
====
[Baekjoon](https://www.acmicpc.net/submit/2438/30921956)

```
import java.util.Scanner;

public class Baekjoon2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
        for(int j=i;j>=1;j--){
            System.out.print("*");
         }
         System.out.println();
        }
    sc.close();
    }
}
```

1.Scanner함수를 출력하여 스캐너 객체를 생성해준다. 
2.반복할 횟수를 n을 사용자에게 받아준다. 
3.for문을 통해서 반복할 횟수만큼 n을 지정해준다. 첫번 째 for문의 i를 만큼 반복시켜준다. 그러면 적은 숫자만큼 공백이 내려가서 해결된다. 
4.처음 j = i 를 할당해주어 별을 출력시킨 후 출력시켜줄 별을 하니씩 줄여나간다. 
