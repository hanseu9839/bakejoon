# baekjoon1193 분수 찾기 
![백준 문제](/Level8/Baekjoon1193/1193.png)
## 이 문제는 분수의 순서를 위의 번호 하고 X가 주어졌을 때, X번째 분수가 무엇인지 구하는 문제이다. 분수의 규칙성을 생각해봐야함.. 잘 생각못했음 ㅠㅠ.
1. 홀수 층에서는 분자는 1씩 줄어들고 분모는 1씩 늘어난다. 
2.  짝수 층에서는 분자는 1씩 늘어나고 분모는 1씩 줄어든다. 
### 일단 초점을 맞춰야 하는 것은 주어진 숫자 X의 층수가 가장 중요 즉, 층수를 구하는 방법은 X의 층수 까지의 분수들의 개수의 합이 주어진 숫자X를 넘을 때 해당 층이 된다.  
### 방의 위치를 구했으면 주어진 숫자 X에서 이전 층수의 분수들의 갯수의 합을 빼면 방의 위치를 구할 수 있다. 
# 분수들의 갯수의 합은 가우스 방식을 사용한다. 
1. 1부터 N까지의 합 = N * (N+1) / 2
2. 1부터 N-1까지의 합 = (N-1)* N / 2
````
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int floor=1,room=1;
        while(true){
            if( num <= (floor * (floor + 1)) / 2){        
                room = num - (floor*(floor - 1)) / 2;
                break;
            }else{
                floor++;
            }
        }
        if(floor % 2 == 0){
            bw.write(room + "/" + (floor - (room-1)));
        }else {
            bw.write((floor-(room-1)) + "/" +room);
        }
        br.close();
        bw.flush();
        bw.close();
       
    }
}
