import java.util.Scanner;

public class Baek2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int R = scan.nextInt();
        for(int i=0;i<R;i++){
            int T = scan.nextInt();
            String S = scan.next();
            for(int j=0;j<S.length();j++)
            {
                for(int z=0;z<T;z++){
                    System.out.print(S.charAt(j));                    
                }
            }
            System.out.println();
        }
        scan.close();
    }

}
