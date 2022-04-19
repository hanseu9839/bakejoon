import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Acmhotel {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rN = Integer.parseInt(br.readLine());
        for(int i=0;i<rN;i++){
            int height = Integer.parseInt(br.readLine());
            int roomNum = Integer.parseInt(br.readLine());
            int floor=0,wN=0;
            if(roomNum % height ==0){
                floor=height*100;
                wN = roomNum / height;
            }else{
                floor = (roomNum % height) * 100;
                wN = (roomNum / height) + 1;
            }
            int answer = floor + wN ;
            System.out.println(answer);
        
        }
    }
}