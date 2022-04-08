import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int floor=1,room=1;
        while(true){
            if( num <= (floor * (floor + 1)) / 2){        
                room = num - (floor*(floor - 1)) / 2;
                break;
            }else{
                floor++;
            }
        }
        if(floor % 2 == 0){
            bw.write(room + "/" + (floor - (room-1)));
        }else {
            bw.write((floor-(room-1)) + "/" +room);
        }
        br.close();
        bw.flush();
        bw.close();
       
    }
}
