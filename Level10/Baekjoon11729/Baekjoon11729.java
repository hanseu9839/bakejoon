package Baekjoon11729;

import java.util.Scanner;

public class Baekjoon11729 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        sb.append((int)(Math.pow(2,N)-1)).append('\n');
        Hanoi(N,1,2,3);
        System.out.println(sb);
    }                              //  123
    public static void Hanoi(int N,int start, int mid, int to){
        if(N==1){
            sb.append(start+" "+to+"\n"); //1 2
            return;
        }
                                
        Hanoi(N-1,start,to,mid);//3 1 3 2
        sb.append(start+ " "+to+"\n");//2 1 3 
        Hanoi(N-1,mid,start,to);// 1 
    }//(1 3) (2 3) 
}
