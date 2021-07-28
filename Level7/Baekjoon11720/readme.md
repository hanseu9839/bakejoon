# Baekjoon11720 문제 

### 출제 문제 정보
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

# 참고 후 다시 풀어본 문제 
```
import java.util.Scanner;

public class Baek11720{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int loop = scan.nextInt();
        String strNum = scan.next();
        String text;
        for(int i=0;i<loop;i++){
            text = strNum.substring(i,i+1);
            int one = Integer.parseInt(text);
            sum += one;
        }
        System.out.println(sum);
        scan.close();
    }
}
```

1. scanner객체를 생성하여 buf에 넣어줄 변수 scan을 선언하였다. 
2. 정수형 변수 sum을 선언해주었다. 
3. loop변수에 몇번 입력받을 것인지 사용자에게 받아준 숫자를 할당해준다. 
4. String strNum을 통해서 scan.next를 통해 사용자에게 받아온 문자형 숫자들을 할당해준다. 이때 loop를 통해서 받은 숫자까지만 출력해줄 수 있을 것이다. 
5. String text를 선언하여 subString으로 문자열을 자른것을 temp와 같이 잠시 할당해주어 정수형으로 바꾸어주기 위해서 선언하였다. 
6. for문 사용해준다. 단, 아까 사용자에게 입력받은 숫자만큼의 문자열 숫자를 각 자리수마다 차례대로 더해줄 것이니 loop보단 작아야한다. 왜냐면 배열은 0번지 부터 시작하기 떄문이다. 
7. text에 subString을 사용해서 하나씩 넣어준다. 
8. Integer.parseInt로 String객체를 Integer로 바꾸어주어 sum+=을 통해서 하나씩 더해줌 


# 사용하였지만 자세히 모르는 문법들 개념들

## String substring(int index) 
substring 함수는 두가지가 있으면 , 그 중 첫번쨰로 인자값을 하나만 받는 함수이다. <br/>
인자값은 int형으로 substring하고자 하는 문자열의 앞에서 부터 몇번째 위치인가를 지정하는 값입니다.<br/>
입력받은 인자값을 index로 해당 위치를 포함하여 이후의 모든 문자열을 리턴 시키는 함수이다. <br/>
<br/>
이떄 이 index값은 0부터 시작 합니다. (첫번쨰 자리에 있다고 1부터 시작한다고 생각하면 안된다.)

# SubString
문자열 자르기하면 가장먼저 생각나는 함수이다. 문자열 함수에 익숙해지면 SubString함수와 다른함수들을 섞어서 정말 다양하게 활용할 수 있다.

## 사용 예)
```
String str = "0123456789";
str.substring(5);
```
위와 같은 str문자열이 있을 때 0~4까지를 숫자문자를 제외한 56789를 가져오게 한다. 

```
String str2 = "자바코딩배우기";
System.out.println(str2.substring(4));
```
위와 같은 문자열을 substring(4)를 하면 index 가 4인 위치의 문자를 포함한 문자열을 리턴한다. 
|문자열|자|바|코|딩|배|우|기|
|----|--|--|--|--|--|--|--|
|index값|0|1|2|3|4|5|6|

위 표를 보면 "배우기"를 가져오기 위해서는 index값을 4로 입력하면 된다는 것을 알 수 있다. 


```
String str3 = "자바코딩 배워볼까?";
System.out.println(str3.substring(5));
```
이번 문자열에는 띄어쓰기를 한 것이 보인다. 물론 공백문자도 하나의 문자이므로 한자리를 차지한다. 
|문자열|자|바|코|딩| |배|워|볼|까|?|
|----|--|--|--|--|--|--|--|--|--|--|
|index값|0|1|2|3|4|5|6|7|8|9|

"배워볼까?"라는 값을 리턴받기 위해서 index값을 5로 입력 


# String substring(int beginIndex,int endIndex)
이번에 알아볼 substring함수는 입력 인자값이 두개 이다.<br/>
첫번쨰 입력 받는 인자 값은 한개인 substring과 같이 가져올 문자열의 시작 부분을 지정한다. <br/>
두번째 입력 받은 인자 값은 가져올 문자열의 끝 부분을 지정하는 것으로 substring(inte index)가 시작부분만 지정하고 나머지 모든 문자열을 리턴하는 것과 차이가 있다. <br/><br/>
beginIndex위치에서 시작하여 endIndex전까지의 위치까지의 값을 리턴 합니다.
<br/>
<br/>

## 다음 문자열중 356512값만 가져오는 것을 연습하자. 
```
String str = "0000003565120";
System.out.println(str.substring(6,12));
```

|문자열|0|0|0|0|0|0|3|5|6|5|1|2|0|
|----|-|-|-|-|-|-|-|-|-|-|-|-|-|
|index값|0|1|2|3|4|5|6|7|8|9|10|11|12|

시작 인데스 값을 6으로 끝나는 인덱스 값을 12로 설정하여 원하는 356512 라는 값을 리턴 받을 수 있습니다.<br/>
substring(6,12) ==> index 6위치에서 index 12 - 1 위치 (11자리)까지의 값을 리턴합니다.

```
String str = "0000003565120";
System.out.println(str.substring(6,12));
```


# baekjoon11720 또다른 문제풀이 
```
import java.util.Scanner;
public class baekjoon11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loopNum = scan.nextInt();

        String strNum = scan.next();
        int sum=0;
        if(strNum.length()==loopNum){
            for(int i=0;i<loopNum;i++){
                sum+= Integer.parseInt(String.valueOf(strNum.charAt(i)));
            }
            System.out.println(sum);
        }
        scan.close();
    }
}
```

1. Scanner 객체생성하여 scan변수를 선언한다.
2. loopNum 선언하여 사용자들에게서 반복할 수를 받는다. 
3. strNum을 사용해서 사용자에게 문자열을 받는다. 
4. int sum을 선언하여 초기값 0을 할당해준다. 
5. if문을 통해서 만약 사용자들이 입력해준 숫자문자의 길이와 내가 초기에 입력해준 반복 수가 같으면 if문을 들어가서 for문을 통해서 loopNum을 통해 loopNum만큼 반복해준다.
6. sum += Integer.paraseInt를 통해서 Integer형으로 바꾸어준다. strNum.charAt(i) 을 통해서 strNum배열에 있는것을 charAt을 통해서 하나씩 꺼내서 sum에 넣어주어야 한다. 
7. System.out.println 을 통해서 sum을 출력해준다. 


# 모르는 자바 문법 
# charAt()의 개념 

### charAt()이란?
이전에 Scanner로 입력받으면 String 으로 저장된다.그래서 등장한게 charAt()함수이다. <br/> String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석이다. <br/> 
charAt()이 있기때문에 Sanner를 쓰면서도 char타입으로 사용할 수 있는 것이다. 

### charAt()의 형태
기본적으로 charAt()을 사용하려면 String타입의 문자열이 필요한 것은 당연할 것이다. 

# 사용 예)
```
String str = new String();
str = "안녕하세요";
str.charAt();
```
String 타입의 참조변수 str에 "안녕하세요"라는 문자열을 저장함 <br/>
str 을 char타입으로 변환하는 방법은 str.charAt();이라고 내가 선언한 String 변수 뒤에 . charAt()메서드만 사용하면된다. 


# 참고문헌 
[substring문법참고1](https://jamesdreaming.tistory.com/81)
[substring문법참고2](https://coding-factory.tistory.com/126)