import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1978answer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num);  
        int soloN =0;
        while(st.hasMoreTokens()){
           boolean flag=true;
           int soloNum =Integer.parseInt(st.nextToken());
           if(soloNum==1){
               continue;
           }
           for(int i=2;i<soloNum;i++){
               if(soloNum%i==0){
                    flag=false;
                    break;
               }
           }
           if(flag){
                soloN++;
           }
        }
        System.out.println(soloN);
    }
}
