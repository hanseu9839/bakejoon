package Baekjoon11729;

import java.util.Scanner;

public class BaekjoonReHanoi {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            sb.append((int)(Math.pow(2,N)-1) + "\n");
            Hanoi(N,1,2,3);
            System.out.print(sb);
    }
    public static void Hanoi(int N,int start,int mid,int from){
       if(N==1){
           sb.append(start+" "+from +"\n");
           return;
       }
       Hanoi(N-1,start,from,mid);
       sb.append(start+" "+from+"\n");
       Hanoi(N-1,mid,start,from);

    }
}
