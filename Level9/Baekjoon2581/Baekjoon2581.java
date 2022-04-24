import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int userMin = Integer.parseInt(br.readLine());
        int userMax = Integer.parseInt(br.readLine());
        int sum=0,min=userMax,j,i;
        for(i=userMin;i<=userMax;i++){//2 
            for(j=2;j<Math.sqrt(i);j++){    
                if(i%j==0){
                    break;
                }
            }
            if(i==2){
                sum+=i;
                if(min==0||min>i){
                    min=i;
                }
            }
            if(i%j!=0&&i!=1&&i!=0){
                sum+=i;
                if(min==0||min>i){
                    min=i;
                }
            }
        }
        if(sum==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
