import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon {
    public static int[][] APT =new int[15][15];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TK = Integer.parseInt(br.readLine());
        makeAPT();
        for(int i=0;i<TK;i++){
            int floor = Integer.parseInt(br.readLine());
            int width = Integer.parseInt(br.readLine());
            int number=APT[floor][width];
            sb.append(number).append("\n");
        }
        System.out.println(sb);
    }
    public static void makeAPT(){
        for(int i=0;i<15;i++){
            APT[0][i]=i;
            APT[i][1]=1;
        }
        for(int i=1;i<15;i++){
            for(int j=2;j<15;j++){
               APT[i][j]= APT[i-1][j]+APT[i][j-1];
            }
        }
    }
}
