Baekjoon 11654 
====

[Baekjoon11854](https://www.acmicpc.net/problem/11654)


# 보고푼 문제..
```
package Baekjoon;

import java.util.Scanner;

/*
    알파벳 소문자, 대문자, 숫자 0~9중 하나가 주어졌을 때 , 주어진 글자의 아스키 코드값을 출력
    1. buffer or Scanner함수를 사용해준다. for문을 사용해야함 
    2. if문을 통해서 비교해준다. 
*/
public class Baekjoon11654 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int ch = sc.nextLine().charAt(0);
        sc.close();
        System.out.println(ch);
    }
}
```
## 문제풀이
 #### charAt이라는 함수를 사용해서 입력받은 버퍼에서 첫번째 String배열을 ch에 넣어주었다. ch는 int형이기 때문에 자연스럽게 타입변환이 되어진다. 그 후 출력하면됨.. 


# 또 다른 풀이

```
import java.io.*;

public class Main{
    public static void main(Sting[] args)throws IOException{
        BufferedReader br = bew BufferedRead(new InputStreamReader(System.in));
        char [] a = br.readLine().toCharArray();
        System.out.println(int)a[0]);
    }
}

```

## String.toCharArray() 는 문자열을 한 글자씩 쪼개서 이를 char타입의 배열에 집어넣어주는 친절한 메소드이다.
- String(문자열)을 char형 배열로 바꾼다. 
```
String s1 = "Hello World";
char[] charArr = s1.toCharArray();

```
- 추가로, char형 배열을 합쳐서 하나의 String(문자열)로 만들 수 있다. 

```
//how to use method
String s2 = new String(charArr);
```
 

 # 참고문헌 
 https://jainn.tistory.com/158
 출처: https://jainn.tistory.com/158 [Dogfootruler Kim]