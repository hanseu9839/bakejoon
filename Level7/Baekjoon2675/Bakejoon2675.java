import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
    문자열 s를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오 
    BufferedReader를 통해서 문자를 입력받는다. 
    그 후 입력받은 것을 R번 반복시킨다. 
*/
public class Bakejoon2675 {
     
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

       int T = Integer.parseInt(st.nextToken());
       for(int i=0;i<T;i++){// 2
            st = new StringTokenizer(br.readLine());
            //BufferedReader로 읽어온거 구분해주는거아는데 이게 공백을 구분해줘야된데 근데 StringTokenizer하니깐 걍 구분되거든 
            int r = Integer.parseInt(st.nextToken()); //반복 횟수
            String inputString = st.nextToken(); // 주어지는 문자열 
            for(int j=0;j<inputString.length();j++){
                for(int k=0;k<r;k++){
                    sb.append(inputString.charAt(j));
                }
            }
            sb.append("\n");
       }
            bw.write(sb.toString());
            bw.flush();
        }
    }

