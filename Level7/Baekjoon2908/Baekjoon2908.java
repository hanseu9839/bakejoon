import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2908 {
    public static void main(String[] args) throws Exception{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(input);

        String rl = bf.readLine();
        int num[] = new int[2];
        int r = 0;
        StringTokenizer token = new StringTokenizer(rl," ");
        
        while(token.hasMoreTokens()){
            num[r]= Integer.parseInt(token.nextToken());
        }
        bf.close();
        for(int i=0;i<2;i++){
           
        }
    }
}
