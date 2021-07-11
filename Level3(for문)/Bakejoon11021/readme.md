*Bakejoon 11021번 A+B - 7*
=======

[Bakejoon112021](https://www.acmicpc.net/problem/11021)


```
import java.util.Scanner;

class Bakejoon11021{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lp = sc.nextInt();

        for(int i=1;i<=lp;i++)
        {
            int userNum1 = sc.nextInt();
            int userNum2 = sc.nextInt();
            int result = userNum1+userNum2;
            System.out.println("Case #"+i+": "+result);
        }
        sc.close();
    }
}
```