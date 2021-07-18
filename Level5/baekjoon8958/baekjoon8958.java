import java.util.Scanner;

public class baekjoon8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nArray = sc.nextInt();

        String[] array = new String[nArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }
    }
}
