# 백준알고리즘 2908문제 
### 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

### 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

### 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오

## 문제풀이 
### 처음에 '사용자에게 키보드로부터 입력하는 것을 받아 와야겠다.'라는 생각을 가지게 되었다. 그 후 입력 받은 것을 2가지의 숫자를 비교해주는 것이기 때문에 정수형 배열타입을 선언해주어 거기에 할당하여 저장 해야겠다는 생각을 가지고 선언해주었다. 그 후 StringTokenizer나 split를 통해서 문자를 쪼개 주었으며 쪼개 준 문자는 사실상 while문을 통해서 입력해주었지만 조금 더 나은 코드는 Split를 써서 num 에다가 넣어주면 조금 더 객관화된 코드가 될 것 같다. 

### 그 후  숫자를 거꾸로 만들어 주기 위해서 num의 각각의 인덱스를 (num[i]%10)*100 이런식으로 자릿 수를 나머지와 나누기 곱하기를 통해서 일,십,백자리수를 나누어주었다. 그 후 조건문을 통해서 조건을 비교 해준 후 큰 값을 사용자에게 출력 시켜주는 프로그램 형식으로 만들었다. 

<pre><code>
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2908 {
    public static void main(String[] args) throws Exception{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(input);

        String rl = bf.readLine();
        int num[] = new int[2];
        int r = 0;
        
        StringTokenizer token = new StringTokenizer(rl," ");
        
        while(token.hasMoreTokens()){
            num[r]= Integer.parseInt(token.nextToken());
            r++;
        }
        bf.close();
        for(int i=0;i<2;i++){
           num[i] = (num[i]%10)*100 + ((num[i]%100)/10)*10 + num[i]/100;
        }
        if(num[0]>num[1]){
            System.out.println(num[0]);
        }else if(num[0]==num[1]){
            System.out.println("두 수가 같습니다.");
        }else{
            System.out.println(num[1]);
        }
    }
}
</code></pre>

백준 알고리즘 문자열을 풀면서 이 문제 말고는 다 중간에 헷갈려서 만들다가 여기저기 많이 찾아보고 다른 사람이 푼 코드를 보고 나의 것으로 만들기 위해서 왜 이렇게 만들었는지 고민을 하였는데 이번에는 내가 스스로 직접 문제를 풀 수 있었다. 다른 사람들은 어떻게 문제를 풀었는지 궁금하여 찾아보니 * reverse * 라는 함수를 사용하여 문제를 조금 더 쉽게 풀었다. 

그에 관련된 코드는 

<pre><code>
Scanner in = new Scanner(System.in);

int A = in.nextInt();
int B = in.nextInt();

in.close();

A = Integer.parseInt(new StringBuilder.append(A).reverse().toString());
B = Integer.parseInt(new StringBuilder.appned(B).reverse().toString());

System.out.print(A > B  ? A:B);
</code></pre>


이 문제를 풀며 느낀거는 내가 푼 문제를 내가 풀었다고 그냥 넘어갈게 아니라 다른 사람은 어떻게 코드를 짜놓았는지 찾아 봐야 겠다고 생각을 하게 되는 계기가 되었다...