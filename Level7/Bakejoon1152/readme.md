[Baekjoon1152](https://www.acmicpc.net/problem/1152,"Baekjoon link")

# 문제
### 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

## 문제풀이 
### 처음에는 StringTokenizer라는 함수를 사용하지 않고 문제를 풀려고 하였다. 그렇게 고안 한 것이 사용자에게 키보드로 입력 받을 것을 for문을 통해서 반복하며 공백인지 아닌지 판단을 해주고 공백이 2개이상 있을 수 있는 경우가 있으니 공백이 두개이상이 아닐경우에만 증가시킬 수 있도록 코드를 구현해주는 것이였다. 하지만 이렇게 되면 단어의 개수가 1개가 덜 출력된다는 것을 알아버렸다. 그래서 마지막에 줄바꿈 문자가 있다면 1개를 추가시켜주는데 공백이 아닐 경우에만 추가 시켜줄 수 있도록 코드를 고안하니 아무것도 입력을 안하고 출력하니 0이나왔는데 이것이 문제가 맞지 않는다는 결과가 나와서 어케 해야될지 고민중이다.. 결국 돌고돌아 StringTokenizer로 구현을 하게 되었다. 문자열에 대한 공부가 아무리 봐도 조금 더 필요한 상황인거 같다. 

# StringTokenizer를 쓰지 않은 코드.(에러가 남)
<pre><code>
InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String sentence = br.readLine();
        char strTemp;
        char preStrTemp='1';
        int rN = 0;
        for(int i=0;i<sentence.length();i++){
            strTemp=sentence.charAt(i);
           
            if(preStrTemp!=' ')
                if(strTemp==' ')
                rN++;
            else if(strTemp=='\n'){
                if(preStrTemp!=' ') rN++;

            }
            
            preStrTemp=strTemp;

        }
        br.close();
        System.out.println(rN);
</code></pre>

# StringTokenizer를 사용한 코드
<pre><code>
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String sentence = br.readLine();
        br.close();
        
        StringTokenizer st = new StringTokenizer(sentence," ");
        System.out.print(st.countTokens());
    }
}
</code></pre>