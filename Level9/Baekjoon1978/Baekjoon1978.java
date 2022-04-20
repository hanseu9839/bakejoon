import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1978 {
    public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int Num=Integer.parseInt(br.readLine());
            int soloNum=0;
            int []realNum = new int[Num];
            String StringNum = br.readLine();
            StringTokenizer st = new StringTokenizer(StringNum);
            for(int i=0;i<Num;i++){
                realNum[i]=Integer.parseInt(st.nextToken());
                if(realNum[i]==1){
                    continue;
                }
                else if(realNum[i]==2||realNum[i]==3||realNum[i]==5){
                    soloNum++;
                }else if(realNum[i]%2!=0||realNum[i]%3!=0||realNum[i]%5!=0){
                    soloNum++;
                }
            }
            System.out.println(soloNum);
    }      
}
