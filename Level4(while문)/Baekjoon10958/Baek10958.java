
import java.util.Scanner;

public class Baek10958 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            while(true){
                int inputNum1 = scan.nextInt();
                int inputNum2 = scan.nextInt();
                int result = inputNum1+inputNum2;
                if(inputNum1 ==0 && inputNum2 ==0)
                    break;
                System.out.println(result);
            }
            scan.close();
        }
}
