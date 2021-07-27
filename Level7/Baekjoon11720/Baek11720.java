import java.util.Scanner;

/*
N개의 숫자가 공백없이 쓰여진다.
이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오. 

*/


public class Baek11720{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int loop = scan.nextInt();
        String strNum = scan.next();
        String text;
        for(int i=0;i<loop;i++){
            text = strNum.substring(i,i+1);
            int one = Integer.parseInt(text);
            sum += one;
        }
        System.out.println(sum);
        scan.close();
    }
}