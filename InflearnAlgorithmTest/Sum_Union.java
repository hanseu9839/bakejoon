package InflearnAlgorithmTest;

import java.util.Scanner;

class Sum_Union{
    static int arr[];
    static int total,n;
    static String answer = "NO";
    static boolean flag=false;
    static void solution(int L, int sum,int []arr){
        if(flag) return;
        if(total/2<sum) return;
        if(L==n){
            if((total-sum)==sum){
                answer = "YES";
                flag = true;
            }
        }else{
            solution(L+1,sum+arr[L],arr);
            solution(L+1,sum,arr);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            total += arr[i];
        }
        solution(0,0,arr);
        System.out.println(answer);
        scan.close();
    }
}