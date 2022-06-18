import java.util.*;
public class Baekjoon10870 {
    static int []arr;
    static int fibonnachi(int num){
        if(num == 0){
            arr[0]=0;
            return 0;
        }else if(num == 1){
            arr[1]=1;
            return 1;
        }
        else if(num==2){
            return arr[num] = fibonnachi(num-1)+fibonnachi(num-2);
        }else{
            return arr[num] = fibonnachi(num-1)+fibonnachi(num-2);
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        arr = new int[n+1];
        fibonnachi(n);
        System.out.println(arr[n]);
    }
}
