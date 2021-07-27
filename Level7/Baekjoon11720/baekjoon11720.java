import java.util.Scanner;

public class baekjoon11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loopNum = scan.nextInt();

        String strNum = scan.next();
        int sum=0;
        if(strNum.length()==loopNum){
            for(int i=0;i<loopNum;i++){
                sum+= Integer.parseInt(String.valueOf(strNum.charAt(i)));
            }
            System.out.println(sum);
        }
        scan.close();
    }
}

