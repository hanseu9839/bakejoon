import java.util.Scanner;

public class baek3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt() % 42;
        }
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    flag = true;
            }
            if (flag == false)
                cnt++;
        }
        System.out.println(cnt);
    }
}
