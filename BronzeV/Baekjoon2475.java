import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon2475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int sum =0;
        StringTokenizer st = new StringTokenizer(num);
        while(st.hasMoreTokens()){
            int n=Integer.parseInt(st.nextToken());
            sum += n*n;
        }
        int answer = sum % 10;
        System.out.print(answer);
    }        
}
