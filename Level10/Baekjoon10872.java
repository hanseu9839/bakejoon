import java.util.Scanner;

public class Baekjoon10872 {
    public static int sum=1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rN=scan.nextInt();
        int number =factorial(rN);
        System.out.println(number);
        scan.close();
    }
    public static int factorial(int number){
        sum*=number;
        number--;
        if(number>0){
            factorial(number);
        }   
        return sum>0? sum:1;
    }
}
