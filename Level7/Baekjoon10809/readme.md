# Baekjoon 10809 알파벳 찾기 

### 문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
<br/>

### 입력 
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

### 출력 
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치 , ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다. <br/>




# 보고 푼 문제 풀이 
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        String userAlphabet = br.readLine();
        for(char c='a';c<='z';c++){
            sb.append(userAlphabet.indexOf(c));    
            sb.append(' ');
        }
        System.out.println(sb);
        br.close();
    }
}

```

1. BufferedReader객체를 선언하여 stream에서 입력을 받기 위해 br변수를 선언 
2. StringBuilder로 append를 통해서 String에 접근 변수 sb 를 선언 
3. 사용자에게서 글자를 입력받는다. 그것을 저장해 줄 변수를 userAlphabet으로 선언해주었다. 
4. 자바에서 for문에서 문자형도 가능하다. 그래서 반복할 변수에 a그리고 끝은 z로 선언해준 모습이다. 이렇게 해주기 싫으면 int형으로 97~122로 해주면되는데 이렇게 해주는게 더 마음에 편한다. 
5. 그러고 append를 통해서 sb에 indexOf를 통해서 비교한 것을 넣어주는데 indexOf는 해당하는 배열에 인덱스를 sb에 넣어주는 것이다. 비교하였을 때 똑같지 않으면 -1을 넣어줌 . 