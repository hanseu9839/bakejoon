package Baekjoon1065;

import java.util.Scanner;

public class Baekjoon1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count;
        if (N < 100) {
            System.out.println(N);
        }else if{
            count = 99;
                for(int i=100; i<N;i++){
                    if(IsHanNumber(i)){
                        count++;
                    }
                }
        }


        
    }
}
