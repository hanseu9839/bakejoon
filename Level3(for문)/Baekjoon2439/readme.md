Baekjoon2439 별찍기 
=====
[Baekjoon2439](https://www.acmicpc.net/problem/2439)


```
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int nStar = scan.nextInt();
        scan.close();
        for (int i = 0; i < nStar; i++) {
            for (int j = 0; j < nStar - i - 1; j++)// 5-0-1 4
                System.out.print(" ");
            for (int k = 0; k < i; k++) // j=0 i=1 2 3 4 5
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
```

1. nStar 변수를 선언해주어 몇번 반복해줄지 사용자에게 입력을 받는다. 
2. scan.close를 통해서 scan Buffer를 닫아준다. 
3. for문을 통해서 nStar에서 몇번 반복해줄지 정해준 만큼 * (asterisk)를 들을 출력시켜준다.
4. nStar - i -1은 i=0이기때문에 처음에 -1을 해주어야하기떄문에 -1을 해주었다. 또한 5라고   가정하에 5-0-1 기 떄문에 4가된다.
5. k=0이기떄문에 i에 개수만큼 반복시켜준다. 즉, 그러면 k는 K=0<1보다 작아서 조건이 충족되어 반복문에 내려간다. 그 후 *을 하나 출력시켜주면 띄어쓰기 4칸 별한개가 나오게된다.  그 후 "\n"문구를 통해서 한줄내려가 똑같이 조건문이 충족될까지 행해지게된다. 