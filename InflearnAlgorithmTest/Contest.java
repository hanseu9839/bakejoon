package InflearnAlgorithmTest;

import java.util.ArrayList;
import java.util.Scanner;

class Grade{
    int score, time;
    Grade(int score, int time){
        this.score = score;
        this.time = time;
    }
}
public class Contest {
    static int n,m;
    static int answer = 0;
    static int solution(int L,int sum,int time, ArrayList<Grade> arr){
        
        if(time>m) return 0;
        if(n==L){
            answer = Math.max(answer, sum);
        }else{
            int s = arr.get(L).score;
            int t = arr.get(L).time;
            solution(L+1,sum+s,time+t,arr);
            solution(L+1,sum,time,arr);
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayList <Grade> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        for(int i=0;i<n;i++){
            int s = scan.nextInt();
            int t = scan.nextInt();
            arr.add(new Grade(s,t));
        }
        scan.close();
        System.out.println(solution(0,0,0,arr));
    }
}
