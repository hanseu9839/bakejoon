import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1929 {
    public static boolean soloNum[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st=new StringTokenizer(str);
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        soloNum=new boolean[max+1];
        make_soloNum();
       for(int i=min;i<soloNum.length;i++){
           if(soloNum[i]!=true){
                System.out.println(i);
           }
       }
        
    }
    public static void make_soloNum(){
        soloNum[0]=true;
        soloNum[1]=true;
        for(int i=2;i<=Math.sqrt(soloNum.length);i++){
            for(int j=i*i;j<soloNum.length;j+=i){
                soloNum[j]=true;
            }
        }
    }
}
