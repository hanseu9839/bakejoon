import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1018 {
    public static boolean [][]board;
    public static int min=64;
    public static void answer(int r, int c){
        int answer = 0;
        int end_row = r + 8;
        int end_column = r + 8;
        boolean flag = board[r][c];
        for(int i=r;i<end_row;i++){
            for(int j=c;j<end_column;j++){
                if(board[i][j]!=flag){
                    answer++;
                }
                flag = (!flag);
            }
            flag = (!flag);
        }
        answer = Math.min(answer,64-answer);
        min = Math.min(answer,min);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st =new StringTokenizer(input," ");
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        board = new boolean[row][column];
        for(int i=0;i<row;i++){
            String line = br.readLine();
            for(int j=0;j<column;j++){
                if(line.charAt(j)=='W'){
                    board[i][j]=true;
                }else{
                    board[i][j]=false;
                }
            }
        }
        int r = row - 7;
        int c = column - 7;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                answer(i,j);
            }
        }
        System.out.print(min);
    }
}
