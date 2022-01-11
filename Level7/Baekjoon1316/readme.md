# bakejoon1316 그룹 단어 체커 
[Baekjoon groupp word Checker](https://www.acmicpc.net/problem/1316)

# 문제
### 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

### 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

# 해설 
### 처음 문제를 풀 때는 어떻게 풀어야 하는지 지문을 이해하지 못했었다. 그래서 다른 사람이 푼 해설을 보고도 이해가 가지않아 다른 사람이 짠 코드를 보고 이해한 바탕으로 코드를 풀었다. 다른 사람들은 참고하면 일단 단어를 입력 받았음. 
### 그 후 반복해 줌.. 그러고 나서 체크 해줌 배열을 만들어 주었음 26개 왜냐하면 알파벳이 26개이기 때문이다. 그 후에 이전문자를 남겨주었음 그러고 

### 처음나온값은 이미 나온 거기 때문에 해당하는 배열을 true 로 만들어준다. 
### 그 후에 .word.length()를 길이가 1이상일때 처음 값은 이미 checkArray에 넣어 주었기 때문에 굳이 for문에서 0부터 시작안해주어도 된다. 
### j가 나와서 -1일때 이전과 동일하게 나온것이다. 그럼 내가 입력해놓은 단어수에서 하나를 빼준다. 한번 나왔는데 앞의 단어랑 똑같이 나온거면 탈락시킨다.  

<pre><code>
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int rNum = Integer.valueOf(bf.readLine());
        int count =0;
        
        for(int i=0;i<rNum;i++){
        String wordLine=bf.readLine();
            if(check(wordLine)==true)
                count++;
        }
        bf.close();
        System.out.println(count);
        }
        public static boolean check(String word){
            boolean checkArr[] = new boolean[26];
            int preCheck = word.charAt(0)-97;
            checkArr[preCheck] = true; 
            for(int i=1;i<word.length();i++){
                int curCheck = word.charAt(i)-97;                
                if(checkArr[word.charAt(i)-97]==true && preCheck!=curCheck){
                    return false;
                }
                else {
                    checkArr[word.charAt(i)-97]=true;
                    preCheck = curCheck;
                    continue;
                }
                    
            }

            return true;
        }
    }


</code></pre>

# 다른 사람들이 푼 문제 풀이
### List, stack등 다양한 것들을 사용하여 배열로 할당해주었다가 비교를 해주어 풀었다.. 


<pre><code>
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p1316 {
    static int n;
    static List<Character> list;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int cnt =n;
        for(int i=0;i<n;i++){
            String input = br.readLine();
            char[] cArr = input.toCharArray();
            list = new ArrayList<>();
            for(int j=0;j<cArr.length;j++){
                if(j==0)continue;
                if(cArr[j] != cArr[j-1]){
                    list.add(cArr[j-1]);
                    cnt--;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}

</code></pre>



# 잘 모르는 개념
리스트는 배열의 한계 때문에 만들어진 자료형 이다. 배열을 사용하기 위해서는 크기를 정해야 한다. 그런데 프로그래밍 중 크기를 알 수 없는 경우가 더 많다. List는 메모리가 허용하는 한 계속해서 추가 할 수 있도록 만든 자료형 클래스이다. 

- java.util.List는 인터페이스 클래스이며 java.util.Collection 인터페이스를 구현한 것입니다. List를 사용하기 위해서는 아래 클래스들중 하나로 인트턴스화 할 수 있다. 
<pre><code>
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

List listA = new ArrayList();
List listB = new LinkedList();
List listC = new Vector();
List listD = new Stack();
</code></pre>

## 값 추가하고 꺼내는 방법 - add.get
-------------------------------

이번에는 값들을 추가하고 인덱스에 해당하는 값을 하나씩 가져오거나 모든 데이터를 꺼내는 방법이다. 값을 추가하기 위해서는 add()함수를 사용한다. 아래 그림처럼 텍스트값 3개를 추가하였다. 그리고 제일 아래에 있는 add()함수는 형태가 좀 틀리다. 이것은 첫번째 인수로 요소값을 넣었습니다. 요소값을 넣고 데이터를 추가하게 되면 해당 요소에 값을 교체하는 것이 아니라 추가하고 데이터들이 하나씩 밀리게 된다. 

<pre><code>
List listA = new ArrayList();
listA.add("김삿갓");
listA.add("홍아리");
listA.add(new String("홍길동"));
listA.add(1,"1번째 요소값");
</code></pre>

인덱스로 값을 조회하고 싶다면 get(index)함수를 사용하면 된다. 하나씩 조회하고 싶을 때 사용하는 방법이고 모든 데이터를 전부 출력하고 싶다면 Iterator와 ForLoop를 사용한다. 

<pre><code>
String element0 = listA.get(0).toString();
String element1 = listA.get(1).toString();
String element2 = listA.get(2).toString();

//Iterator통한 전체 조회
while(iterator.hashNext()){
    String element = (String) iterator.next();
}

for(Object object : listA){
    String element = (String) object;
}
</code></pre>


[참고문헌](https://mainia.tistory.com/2323)