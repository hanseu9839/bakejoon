import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        String userAlphabet = br.readLine();
        for(char c='a';c<='z';c++){
            sb.append(userAlphabet.indexOf(c));    
            sb.append(' ');
        }
        System.out.println(sb);
        br.close();
    }
}
