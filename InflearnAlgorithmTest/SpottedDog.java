package InflearnAlgorithmTest;

import java.util.Scanner;

public class SpottedDog {
    static int []arr;
    static int w,n;
    static int answer = 0;
    static int solution(int L,int sum){
        if(sum>w) return 0;
        if(n==L){
            answer=Math.max(sum,answer);
        }else{
            solution(L+1,sum+arr[L]);
            solution(L+1,sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        w = scan.nextInt();    
        n = scan.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
        System.out.println(solution(0,0));
        
    }
}
