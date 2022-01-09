# Baekjoon5622 다이얼 문제 
[Baekjoon5622](https://www.acmicpc.net/problem/5622, "Baekjoon Quize link")

# 5622 문제 
![ 다이얼](/Users/seunggyunhan/Documents/1.png)
### 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

### 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

### 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.

### 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.


# 문제 풀이 
우선 사용자에게 단어를 입력 받기 위해서 BufferedReader와 InputStreamReader를 사용해주었다. 그 후 readLine을 통해서 내가 입력해 준 단어 한 줄을 입력해서 와주었으며 내가 입력한 것을 각각을 charAt을 통하여 하나씩 단어를 빼어주어 저장 시킨 후 String을 통해서 대문자로 UpperCase를 통해서 바꾸어 주었다. 그 후 각각을 switch조건문을 통해서 비교해주어 각각의 수를 다이얼에서 +1을 해주어 더 해주었다.
### 이제 
<pre><code>
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5622{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine();
        int wordSum=0;
        for(int i=0;i<word.length();i++){
           char oneWord=word.charAt(i);
           String UpWord = Character.toString(oneWord);
        switch(UpWord.toUpperCase()){
            case "A":
            case "B":
            case "C":
            wordSum+=3;
            break;
            case "D":
            case "E":
            case "F":
            wordSum+=4;
            break;
            case "G":
            case "H":
            case "I":
            wordSum+=5;
            break;
            case "J":
            case "K":
            case "L":
            wordSum+=6;
            break;
            case "M":
            case "N":
            case "O":
            wordSum+=7;
            break;
            case "P":
            case "Q":
            case "R":
            case "S":
            wordSum+=8;
            break;
            case "T":
            case "U":
            case "V":
            wordSum+=9;
            break;
            case "W":
            case "X":
            case "Y":
            case "Z":
            wordSum+=10;
            break;
            default : wordSum+=0;
            break;
        }
    }
    System.out.println(wordSum);
    }
}
</code></pre>

# 다른 사람이 푼 문제 풀이 
### 나같은 경우는 switch case를 이용하여 문제를 풀었지만 if문을 통해서 비교를 해준 후 문제를 푼 사람들 도 있었다. 그에 해당하는 코드는 아래와 같으며 else if문을 Z까지 해주어 And연산인 &&을 통해서 조건문을 만들어주어 해당하는 것에 알파벳이 있으면 출력되도록 만들어주었으며 내가 짠 코드는 대소문자를 가리지 않지만 여기서 보면 대문자만 가능하도록 만들어준 모습이다.

<pre><code>
 Scanner sc = new Scanner(System.in);
 String st = sc.next();
 int time =0;
 char tmp;
 for(int i=0;i<st.length();i++){
     tmp = st.charAt(i);
     if(tmp>='A' && tmp <= 'C')
        time +=3;
     else if(tmp>='D' && tmp <= 'E')
        time +=4;
 }
</code></pre>