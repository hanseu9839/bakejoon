BaekJoon 10951 
======
#StringTokenizer 
StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스다. 그렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 부른다. <br/><br/>

StringTokenizer를 사용하기 위해서는 Java.util.String.Tokenizer를 import해야한다. 사용법은 굉장히 쉽다. 사용하는 메소드도 몇개 없음. 

|생성자|설명|
|-----------------|---------------------|
|public StringTokenizer(String str)|전달된 매개변수 str을 기본 (default)delim으로 분리합니다. 기본 delimiter는 공백 문자들인 "\t\n\r\t"입니다. |
|public StringTokenizer(String str,String delim)|특정 delim으로 문자열을 분리합니다.|
|public StringTokenizer(String str,String delim,boolean returnDelim)|Str을 특정 delim으로 분리시키는데 그 delim까지 token으로 포함할지를 결정합니다. 그 매개변수가 returnDelim로 true일시 포함, false일 떈 포함되지 않는다.|

## int countTokens()
* 남아있는 token의 개수를 반환합니다. 전체 token의 개수가 아닌 현재 남아있는 token의 개수이다. 

## boolean hasMoreElements(), boolean hasMoreTokens()
*다음의 token을 반환합니다. StringTokenizer는 내부적으로 어떤 위치의 토큰을 사용하였는지 기억하고 있고 그 위치를 다음으로 옮김니다. 두가지 메소드는 모두 같은 값을 반환합니다. 

## Object nextElement(),String nextToken()
* 이 두가지 메소드는 다음의 토큰을 반환합니다. 두 가지 메소드는 같은 객체를 반환하는데 반환형이 다르다. nextElement는 Object,nextToken은 String반환 

[StringTokenizer참조](https://reakwon.tistory.com/90)

## hasNextLine()
* 다음에 읽을 값이 있는지 확인하는 불린타입의 메소드로 값이 있으면 트루를 반환한다.  NextLine()은 줄 단위로 값을 읽어온다. 여기서 줄 단위가 아닌 단어를 단위로 하고 싶으면 둘 다 Line을 빼고 사용하면 된다. 

```
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon10951{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int a =0;
            int b =0;
            while(sc.hasNextLine()){
                StringTokenizer st = new StringTokenizer(sc.nextLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                bw.write(String.valueOf(a+b));
                bw.newLine();
            }
            bw.flush();
            bw.close();
            sc.close();
        
        }
}
```
1. Scanner를 통해서 입력받는 버퍼를 열어준다. 
2. BufferedWriter를 통해서 입력받은 버퍼를 출력 시켜주기 위해서 BufferedWriter객체를 하나 만들어준다. 
3. 입력 받은 것의 숫자를 저장할 변수를 선언해주었다. 
4. while문을 통해서 hasNextLine()함수를 통해서 다음 입력받을 값이 있으면 true 없으면 false를 선언해준다. 
5. StringTokenizer 객체를 하나 선언해준다. StringTokenizer는 문자열을 우리가 지정한 구분자로 나누어주기 위해서 선언한다. sc.nextLine()을 통해서 줄마다 구분을 해준 것이다. 
6. Integer.parseInt를 통해서 문자열을 Int형으로 만들어준후 st.nextToken()을 통해서 사용자가 입력한 토큰을 반환해줌 .
7. bw.newLine()은 줄바꿈을 해준다. 
8. 더이상 입력받을 것이 없다면 ctrl + z 를 통해서 나간다. 

```
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Algo10951_bufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        int a = 0;
        int b = 0;
        while((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a+b));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
```
1. BufferedReader 객체를 생성하여 버퍼리더를 열어줄 br변수를 하나 선언해준다.  
2. BufferedWriter 객체를 생성하여 버퍼라이트를 해줄 bw변수를 하나 선언해줌 
3. String input = ""; 으로 버퍼에서 읽으면 넣어줄 문자열 저장 공간을 하나 만들어주었다. 
4. int a , int b는 버퍼에서 입력받은 데이터를 숫자 정수형으로 저장하기 위해서 선언해주었다. 
5. input = br.readLine()을 통해서 버퍼에서 읽어온다. 만약 읽어온게 없으면 null출력 (br.readLine() != null) StringTokenizer을 통해서 구분자를 선언해준다. 구분자는 input 
6. st.nextToken을 통해서  버퍼에 있는 값을 반환한다. 그것을 정수형으로 만들어주어 변수 a담아준다. b도 마찬가지 
8. 그 후 bw.write를 통해서 이때 write할떄는 문자형 이기 떄문에 String.valueof(a+b)를 해주어 출력시켜준다. 
9. bw.nextLine()을 통해서 줄을 바꾸어준다. 