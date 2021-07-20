import java.util.Scanner;

public class Baekjoon15596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nArray = sc.nextInt();
        int[] arr = new int[nArray];
        int sum = 0;
        for (int i = 0; i < nArray; i++) {
            arr[i] = sc.nextInt();
        }
        sum = (int) sum(arr);
        System.out.println(sum);
        sc.close();
    }

    static long sum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }

}
