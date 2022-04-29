import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4948 {
    public static boolean soloNum[];
    public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                int soloRn=0;
                int arrN=Integer.parseInt(br.readLine());
                soloNum=new boolean[(2*arrN)+1];
                if(arrN==0){
                    break;
                }
                make_soloArr();
                
                for(int i=arrN+1;i<soloNum.length;i++){
                    if(soloNum[i]!=true){
                        soloRn++;
                    }
                }
                System.out.println(soloRn);
                
            }
    }
    public static void make_soloArr(){
        soloNum[0]=true;
        soloNum[1]=true;
        for(int i=2;i<=Math.sqrt(soloNum.length);i++){
            for(int j=i*i;j<soloNum.length;j+=i){
                soloNum[j]=true;
            }
        }
    }
}
