*bakejooon 1330 두 수 비교하기*
========
[Bakejoon 1330](https://www.acmicpc.net/problem/1330)
[마크다운 작성법](https://gist.github.com/ihoneymon/652be052a0727ad59601)
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int  A = scan.nextInt();
       int B = scan.nextInt();

        if(A>B){
            System.out.println(A);
        }else if(A<B){
            System.out.println(B);
        }else{
            System.out.println(A+" "+B);
        }
    }
}

```

1. scanner를 통해서 사용자에게 입력을 받는다. 
2. if문을 사용하여 A,B변수 중에 값이 누가 더 큰지 확인하고 더 큰수 출력한다. 
3. 값이 똑같다면 둘다 출력한다. 