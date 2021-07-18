Baekjoon8958 OX퀴즈 문제 
=====

[Baekjoon8958](https://www.acmicpc.net/problem/8958)

```
public class baekjoon8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nArray = sc.nextInt();
        int cnt;
        int sum;
        String[] array = new String[nArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }
        for (int j = 0; j < array.length; j++) {
            sum = 0;
            cnt = 0;
            for (int i = 0; i < array[j].length(); i++) {
                if (array[j].charAt(i) != 'X')
                    cnt++;
                else
                    cnt = 0;
                sum += cnt;
            }
            System.out.println(sum);
        }

        sc.close();
    }
}
```

1. Scanner 를 통해서 nArray 몇개의 OXO열을 받을 건지 결정 
2. cnt ,sum 을 통해서 0가 나왔다면 cnt를 증가 시켜준다. 그 증가한 것을 sum에 넣어준다. 
3. for문을 통해서 array의 길이반큼 문자열들을 array에 넣어준다. 
4. array[j].length를 통해서 길이를 구한다. 즉, 하나하나의 스트링의 길이를 구해서 반복 시켜주는 것임 charAt()을 통해서 배열의 String에 있는 것을 문자열을 하나하나의 문자로 가져와서 비교해준다. 



# charAt() 
## charAt()이란?

#### String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환 해주는 것임 

## charAt()의 형태 

#### 기본적으로 charAt()을 사용하려면 String타입의 문자열이 필요한 것은 당연함 

 
## charAt(int index) 사용법 
- 입력 받은 index 번째 문자를 반환 합니다.  
- Java에서 index 값은 항상 0 에서 부터 시작 
```
String str1 = "abcde";
System.out.println(str1.charAt(2));
```
|문자열|a|b|c|d|e|
|------|--|--|--|--|
|index|0|1|2|3|4|

 ** 다른 배열관련 함수 **
 ====
 ## indexOf(String keyword)
 - 문자열 중 입력받은 문자가 있으면 해당 문자의 위치 (index) 값을 리턴하고 문자가 없으면 -1 리턴합니다. 
 - 문자열 조회는 index 값 0 부터 시작 합니다. 
|문자열|D|e|f|i|n|i|t|i|o|n| |o|f| |i|n|d|e|x|O|f|
|-----|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|
|index|0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|

index 3을 리턴함 
``` 
String str2 ="Defination of indexOf";
System.out.println(str2.indexOf("i"));
```

 ## lastIndexOf(String keyword)
 - indexOf 는 왼쪽에서 부터 조회를 하기 때문에 낮은 index 값을 먼저 조회 하게 됩니다. 
 - 이와 반대로 끝에서 부터 조회를 하는 함수도 제공되고 있다. 
```
String str4 = "Definition of indexOf";
System.out.println(str4.lastIndexOf("i"));
```
## length()
- 주어진 문자열의 길이를 리턴합니다.
- 주의 할 것은 index를 리턴 하는게 아니라 실제 문장의 길이를 조회 리턴한다. 

```
String str5 = "a";
System.out.println(str5.length());
```