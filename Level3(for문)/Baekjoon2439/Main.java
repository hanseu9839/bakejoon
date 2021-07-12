import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        for(int j=1;j<=loop;j++){
            for(int i=1;i<=loop-i;i++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
