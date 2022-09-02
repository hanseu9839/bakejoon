package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherAnswer2751 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        boolean[] arr = new boolean[1000001];
        
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            arr[Integer.parseInt(br.readLine())] = true;
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]){
                sb.append(i+"\n");
            }
        }
        System.out.print(sb);
    }
}
