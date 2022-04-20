import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class re1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int floor = 1,parentNum=0,childNum=0; //6 6
        for(int i=1;number>(floor*(floor+1))/2;i++){
            floor=i;
        }
        if(floor%2==0){
            parentNum = floor;
            childNum = 1;
            number-=(floor*(floor-1))/2;
            //4
            for(int i=1;i<number;i++){
                parentNum-=1;
                childNum+=1;
            }       
        }else if(floor%2!=0){
            childNum = floor;
            parentNum = 1;
            number -= (floor*(floor-1))/2;
            for(int i=1;i<number;i++){
                parentNum+=1;
                childNum-=1;
            }
        }  
        System.out.println(childNum+"/"+parentNum);  
    }
}
