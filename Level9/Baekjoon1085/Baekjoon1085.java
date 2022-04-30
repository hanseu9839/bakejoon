import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Baekjoon1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number= br.readLine();
        StringTokenizer st = new StringTokenizer(number);
        int x = Integer.parseInt(st.nextToken());
        int y= Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = Math.min(Math.min(x,w-x),Math.min(y,h-y));
        System.out.println(min);
    }
}
