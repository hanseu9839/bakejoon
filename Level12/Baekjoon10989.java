package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10989 {
    static int []num = new int[10001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
       
        for(int i=0;i<n;i++){
            int cnt = Integer.parseInt(br.readLine());
            num[cnt]++;
        }

        br.close();
        for(int i=1;i<10001;i++){
            while(num[i]>0){
                sb.append(i).append("\n");
                num[i]--;
            }
        }
        System.out.println("--------------------");
        System.out.println(sb);
    }
}
