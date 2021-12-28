import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Bae2675 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int T = Integer.parseInt(st.nextToken());

            for(int i=0;i<T;i++){
                int R = Integer.parseInt(st.nextToken());
                String S = st.nextToken();
                for(int j=0;j<S.length();j++){
                    for(int k=0;k<R;k++){
                    sb.append(S.charAt(j));
                    }
                }
                sb.append("\n");
            }
        }
    }