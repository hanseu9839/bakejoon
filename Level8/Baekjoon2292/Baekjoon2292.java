import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2292{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int room = 1;
        int gap =1;
        while(input>room){
            room+= (gap*6);
            gap++;
        }
        System.out.println(gap);
    }
}