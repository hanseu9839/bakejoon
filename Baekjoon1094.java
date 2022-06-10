import java.util.*;
public class Baekjoon1094 {
    static int temp,answer,n;
    static int[] arr;
    static boolean flag;
    public static void DFS(int L){
        if(L==n){
            
        }else{
            for(int i=0;i<2;i++){
                arr[L]=i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
        DFS(0);
    }
}
