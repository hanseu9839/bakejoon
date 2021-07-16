import java.util.Scanner;


public class baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int arr[] = new int[10];
        boolean flag;
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt()%42;
        }
        for(int j=0;j<arr.length;j++){      
            flag = false;
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]==arr[j]){
                    flag = true;
                    continue;
                }
            }
            if(flag == false){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
