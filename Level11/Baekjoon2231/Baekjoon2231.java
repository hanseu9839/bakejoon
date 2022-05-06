package Baekjoon2231;

import java.util.Scanner;

/* 
어떤 자연수 N이 있을 때 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
어떤 자연수 M의 분해합이 N인경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 

216=(216+2+1+6)
추가 풀이 방법 
즉, 수식으로 보면 다음과 같다.

 

N(4) = K + k1 + k2 + k3 + k4

그리고 이항을 하면 다음과 같다
N(4) - (k1 + k2 + k3 + k4) = K

즉, 네자릿수 N 의 각 자릿수의 합이 최대일 때는 언제인가?

9 + 9 + 9 + 9 일 것이다.

 

즉, 우리는 입력받은 정수 N 에 대하여 자릿수의 길이만큼 9를 빼주면 된다.

그 미만의 수는 생성자가 될 수 없다는 것은 자명하다는 것이다.

 

 

정리하자면

N - (9 × K의 길이) 부터 탐색하여 N 까지만 탐색하면 된다.
*/
public class Baekjoon2231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numberString = scan.nextLine();
        int number = Integer.parseInt(numberString);
        int answer=makeConsturctor(number);
        System.out.println(answer);
    }
    public static int makeConsturctor(int M){
        int result = 0;
       for(int i=0;i<M;i++){
        int number = i;
        int sum =0; // 각 자릿수 합 변수 
        while(number !=0){
            sum += number % 10;
            number /= 10;
        }
        if(sum + i == M ){
            result = i;
            break;
        } 
    }
        return result;
    }
}
