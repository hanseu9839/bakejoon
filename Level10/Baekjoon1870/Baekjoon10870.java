package Baekjoon1870;

import java.util.Scanner;

public class Baekjoon10870 {
    public static int fibona[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibona=new int[n+1];
        fibo(n);
        System.out.println(fibona[n]);
        scan.close();
    }
    public static void fibo(int number){
        fibona[0]=0;
        if(number>0){
            fibona[1]=1;
        }
        for(int i=2;i<=number;i++){
            fibona[i]=fibona[i-1]+fibona[i-2];
        }
    }
}
