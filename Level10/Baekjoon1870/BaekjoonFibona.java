package Baekjoon1870;

import java.util.Scanner;

public class BaekjoonFibona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = fibonacci(N);
        System.out.println(result);
    }
    private static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n ==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }//스택 구조로 위로 쌓이면서 fibonacci 가 n이 작은 수부터 나오게 된다. 이에 따라 0 1 1 이고 이를 더해주어 2 3 5 이런 순으로 스택이 쌓이기 때문에 가능한 구조이다.
}
