Baekjoon1065
###
[Baekjonn1065](https://www.acmicpc.net/problem/1065)

# 문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

# 입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

|예제 입력|예제 출력|
|---------|--------|
|110| 99|
|1|1|
|210|105|
|1000|144|

# 여자친구 코드 
```
//한수
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print(arithmetic_sequence(sc.nextInt()));
      sc.close();
 
    }
   //한수 함수를 만들어서 
   public static int arithmetic_sequence(int num) {
      int cnt = 0;
      if (num < 100) {
         return num;
      }
      else {
         cnt = 99;
         if(num == 1000) {
            num = 999; //예외처리 1000보다 큰 값 넣어지면 안되니까.
         }
         for(int i = 100; i<=num; i++) {
            int hun = i/100;
            int ten = (i/10) % 10;
            int one = i % 10;
            
            if ((hun - ten) == (ten - one)) {
               cnt++;
            }
         }
      }
      return cnt;
   }
   
}
```



# 내가 직접짠 코드 (보고 구현함..)
```
package Baekjoon1065;

import java.util.Scanner;

public class Baekjoon1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        if (N < 100) {
            System.out.println(N);
        } else {
            count = 99;
            for (int i = 100; i <= N; i++) {
                if (IsHanNumber(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }

    public static boolean IsHanNumber(int n) {
        boolean flag = false;
        int hund = n / 100;
        int ten = (n / 10) % 10;
        int one = n % 10;
        if ((hund - ten) == (ten - one)) {
            flag = true;
        }
        return flag;
    }
}

```
### 문제를 다짜고짜 코딩을 하기 앞서서 컨셉 부터 이해하겠다. 어떤 양의 정수 X의 각 자리가 등차수여을 이룬다. 이 뜻은 무엇이냐 ? 

#### 백의자리와 십의자리를 빼고 십의자리에서 일의자리를 빼었을 때 각각의 숫자가 일치하는 것을 등차수열이라고한다. 

