Baekjoon4673 셀프넘버 
====
[Baekjoon4673](https://www.acmicpc.net/problem/4673)


셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.

양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다. 

예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.

33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다. 

생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97

10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오. 

# 참조한 코드 
```
package Baekjoon4673;

public class Baekjoon4673 {
    public static final int MAX = 10001;

    public static void main(String[] args) {

        boolean[] check = new boolean[MAX];
        int notSelfNumber = 0;
        for (int i = 0; i < check.length; i++) {
            notSelfNumber = loopSum(i);
            if (notSelfNumber < MAX) {
                check[notSelfNumber] = true;
            }
        }
        for (int i = 1; i < check.length; i++) {
            if (!check[i])
                System.out.println(i);
        }
    }

    static int loopSum(int num) {
        int sum = num;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}


```



# 내가직접 작성한 코드 
```
package Baekjoon4673;

public class Baek4673 {
    public static final int MAX = 10001;

    public static void main(String[] args) {
        boolean[] array = new boolean[MAX];
        int notSelfNumber = 0;
        for (int i = 0; i < array.length; i++) {
            notSelfNumber = dn(i);
            if (notSelfNumber < MAX)
                array[notSelfNumber] = true;
            while (!array[i]) {
                System.out.println(i);
                break;
            }
        }

    }

    static int dn(int n) {
        int Num = n;
        while (n != 0) {
            Num += n % 10;
            n = n / 10;
        }
        return Num;
    }
}
```

### 문제해석을 하자면 75라는 숫자가 있을 때 각자리수마다 기존 숫자에 더해주는 함수이다. 즉 각각을 %기호를 통해서 나머지를 구하여 각자리수의 나머지를 구해주어 만들어줄 수 있다.  이것을 함수를 통해서 구현해주었다.  셀프넘버란 이러한 숫자들이 각자리수를 더해주었을 때 나오지 않는 수를 말한다. 

# 코드해석
1. 10001까지 배열을 만들어주어야 한다. 왜냐하면 배열은 0번지 부터 시작하기때문에 10000개를 넣어준 것이아닌 100001개의 배열을 생성해주는 것이다. 10001개의 배열을 생성해주어야 하기 때문에 MAX를 10001개로 선언해주었다.
2. 배열을 boolean형으로 생성해주었는데 그 이유는 boolean형 배열을 생성해주면 10001개까지의 배열들이 false로 설정된다.  10000까지 의 숫자 중에 한번이라도 셀프넘버가 아닐경우 즉 각자리수를 더해주었을 때 해당하는 숫자가 나왔을 경우 false를 true로 바꾸어주어 셀프넘버가 아닌것을 걸러줄 준비를 한다. 약간 비빔면같은거 만들때 채 같은 걸 두어서 면은 떨어지지않게하지만 물은 다빠지게 만드는 느낌과 비슷한거 같다. 
3. while 문에서 !array[i] 그니깐 각각의 숫자들이 false인지 확인하고 false라는 selfNumber라는 의미이기때문에 System.out.println으로 출력해준다. selfNumber인 수들을 출력시켜준다. 
4. 대망의 함수를 한번 볼 차례이다. 일단 인자값 하나를 n으로 받아준다. 왜냐하면 10000까지의 숫자중에서 몇개나 selfNumber인지 확인을 해주긴 위해서 작성하는 함수를 만들어 줄 것이기때문에 10000까지의 숫자들을 인자로 받아줄 것이다. 그 받아준 인자값을 
int Num을 사용해서 n을 할당 assignment를 해준다.이렇게 정수형 변수를 하나 선언하여 n을 대입해주어야 n의 데이터를 가공해주기 쉽다. 
while문을 통해서 우리가 받아준 인자값 n이 0이 아니라면 반복문을 반복해서 돈다. 일단 Num을 십으로 나누었을 때 나머지를 구해준다. 그러면 일의자리숫자를 더해주게되고 그 후 n / 10을해서 몫을 구해준다. 아까 우리가 더해준 일의자리가 사라지고 십의자리가 일의자리로 바뀌게된다. 이런과정을 통해서 10000까지의 숫자들을 모두 더해주어 selfNumber가 아닌값들을 위에있는 for문에 보내주는것이다. 이것이 가능한 이유는 for가 10000번 돌기때문에 가능함. 


## 먼가 어려운 문제인거 같았지만 생각보다 어렵지않았는데.. 많이 해맸다..