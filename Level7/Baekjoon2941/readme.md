# 크로아티아 알파벳 (백준 알고리즘 2941번)

[Baekjoon2941 크로아티아](https://www.acmicpc.net/problem/2941 "Baekjoon2941 link")

# 문제
 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다

# 풀이 
### 가장 먼저 문제를 풀기 위해서 사용자에게 입력을 키보드로부터 받은 후 입력 받은 문자의 개수만큼 반복을 해주고 이를 변수에 할당해주어 해당하는 변수가 어떤 값을 가지고 있는지 확인 후 해당하는 문자를 가지고 있는지 조건문을 통해서 비교를 해주었다. 또한 크로아이타 알파벳은 한 단어가 2,3개인 경우도 있으므로 charAt함수를 이용해서 i+1 , i+2 를 이용해서 조건문을 비교 해주어 단어의 수를 세어 주었다. 

<pre><code>
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String alpha = bf.readLine();

        int count =0;

      for(int i=0;i<alpha.length();i++){
          char ch= alpha.charAt(i);
          if(ch == 'c' && i<alpha.length()-1)
          {
              if(alpha.charAt(i+1)=='=' || alpha.charAt(i+1)=='-')
                i++;
          }else if(ch=='d'&&i<alpha.length()-1){
              if(alpha.charAt(i+1)=='z'&&i<alpha.length()-2){
                if(alpha.charAt(i+2)=='='){
                    i+=2;
                }
              }else if(alpha.charAt(i+1)=='-')
                    i++;
          } else if(ch=='l'&&i<alpha.length()-1 || ch=='n'&&i<alpha.length()-1){
              if(alpha.charAt(i+1)=='j')
              i++;
          }else if(ch=='s'&&i<alpha.length()-1||ch=='z' && i<alpha.length()-1){
              if(alpha.charAt(i+1)=='=')
              i++;
          }
          count++;
      }
      System.out.println(count);
    }
}
</code></pre>


나와 똑같이 조건문을 통해서 조건문을 비교해주어 조금 더 간결하게 코드를 짜준 사람들도 있었지만 그 중 색다르게 푼 사람들이 있어서 정리를 해보았다. 
# 다른 문제 풀이 
<pre><code>
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        br.close();
        String[] croatiaAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String alpha : croatiaAlpha) {
            inputLine = inputLine.replaceAll(alpha, "*");
        }
        System.out.println(inputLine.length());
    }
}
</code></pre>

### 해설 
해당하는 문제는 inputLine을 통해서 사용자에게 입력을 받아 주었다. 그 후 크로아티아 알파벳을 배열에 각각 넣어주었다. FOR문의 형식을 보면 for문에 (대입받을 변수 정의 :배열명) 이런식으로 구성되어있다. 
즉, Array배열 항목을 처음부터 하나씩 Alpha대입하여 하나씩 실행한다. inputline에 있는 것들을 크로아티아 알파벳과 동일한게 있다면 전부다 * 로 치환해주었다. 그 후 Length를 구하면 단어의 개수를 구할 수 있다. 