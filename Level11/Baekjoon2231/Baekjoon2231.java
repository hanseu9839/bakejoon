package Baekjoon2231;

import java.util.Scanner;

/* 
어떤 자연수 N이 있을 때 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
어떤 자연수 M의 분해합이 N인경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 

216=(216+2+1+6)

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
