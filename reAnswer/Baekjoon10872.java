import java.util.*;
public class Baekjoon10872 {
    static int answer = 1;
    public int recursive(int num){
        if(num==0){
            return answer;
        }else{
            answer *=num;
            recursive(num-1);
        }
        return answer;
    }
    public static void main(String[] args) {
    Baekjoon10872 T = new Baekjoon10872();
    Scanner scan = new Scanner(System.in);
    int N=scan.nextInt();
    System.out.print(T.recursive(N));
    }
    
}
