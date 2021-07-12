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
            for (int k = 0; k <= i; k++) // j=0 i=1 2 3 4 5
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
```

