import java.util.Scanner;

public class Bakejoon2743 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNum = scan.nextInt();
        int outputNum;
        for(outputNum=inputNum;outputNum>=1;outputNum--){
            System.out.println(outputNum);
        }
    }
}
