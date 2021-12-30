import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String sentence = br.readLine();
        br.close();
        
        StringTokenizer st = new StringTokenizer(sentence," ");
        System.out.print(st.countTokens());
    }
}


/*
 InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String sentence = br.readLine();
        char strTemp;
        char preStrTemp='1';
        int rN = 0;
        for(int i=0;i<sentence.length();i++){
            strTemp=sentence.charAt(i);
           
            if(preStrTemp!=' ')
                if(strTemp==' ')
                rN++;
            else if(strTemp=='\n'){
                if(preStrTemp!=' ') rN++;

            }
            
            preStrTemp=strTemp;

        }
        br.close();
        System.out.println(rN);
*/