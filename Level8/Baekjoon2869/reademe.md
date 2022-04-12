# 달팽이는 올라가고 싶다. 
땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

# 코드 
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2869{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        StringTokenizer st = new StringTokenizer(number);

        
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int day = (length-down)/(up-down);
        if((length - down) % (up - down) != 0 ){
            day++;
        }
        System.out.println(day);
    }
}
```
### 정상에 올라간 후에는 미끄러지지 않는다. 라는 말 떄문에 낮에 올라가는 길이와 밤에 내려오는 길이를 단순히 빼서 나눗셈하면 안된다. 나는 처음에 그냥 단순히 뺴주었음..
### 즉, 낮에 만약 정점에 도착하면 더이상 미끄러지지 않는다는 것이다. 
### up = 3 , down =1, length = 7 
### up = 3, down=1, length = 8
up일 때 나머지 블럭이 남아있다면 하루가 더 소요된다. 그리고 가장 중요한 것은 down은 
* 항상 up보다 횟수가 하나 작다. 
즉, 이렇게 생각 할 수 있음 "마지막에 도달할 때의 down의 경우의 수(길이)를 뺀다."
잔여 블록이 없으면 문제가 안되지만, 만약에 잔여블록이 있다면? 그러면 한 번 다시 미끄러진 다음에 올라가야 한다는 것이다.
그리고 나머지에 대해서는 다음과 같은 두 가지 상황이 생긴다.

1. ( length - down ) % ( up - down ) 가 정확하게 0 으로 떨어지는 경우
2. ( length - down ) % ( up - down ) 가 나머지가 남는 경우
 

위 예시로 본다면 아래와 같다.

( 7 - 1 ) % ( 3 - 1 ) = 0
( 8 - 1 ) % ( 3 - 1 ) = 1
 

전체 길이에서 down 값을 빼고, up - down 을 나누면  둘 다 몫은 3 이다.

( 7 - 1 ) / ( 3 - 1 ) = 3

( 8 - 1 ) / ( 3 - 1 ) = 3

 

그러나 길이가 8일 경우 down 을 빼고 ( up - down ) 을 했는데 나머지가 생긴다.

 

이유는 up 과 down 의 차이 값으로 정확히 나누어 떨어지는 것이 아니라 아직 잔여 블럭이 남았기 때문이다.

그렇기 때문에 down 을 한 번 더 하게 되고, 자연스레 up 또한 한 번 더 하게 되는 것이다.

 

즉, 하루가 더 소요 되는 것이다.