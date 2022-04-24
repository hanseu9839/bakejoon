import java.util.Scanner;

public class Baekjoon11653 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i=2;
        while(num>=i){
            if(num%i==0){
                System.out.println(i);
                num /= i;
            }else{
                i++;
            }
        }
        scan.close();
    }
}
