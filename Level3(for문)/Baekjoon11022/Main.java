import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loop = scan.nextInt();
        for(int i=1;i<=loop;i++){
            int inputNum1 = scan.nextInt();
            int inputNum2 = scan.nextInt();
            int result = inputNum1+inputNum2;
            System.out.println("Case #"+i+": "+ inputNum1 + " + "+ inputNum2 +" = "+result);
        }
        scan.close();
    }
    
}
