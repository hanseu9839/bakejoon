package Baekjoon1065;

import java.util.Scanner;

public class Baekjoon1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        if (N < 100) {
            System.out.println(N);
        } else {
            count = 99;
            for (int i = 100; i <= N; i++) {
                if (IsHanNumber(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }

    public static boolean IsHanNumber(int n) {
        boolean flag = false;
        int hund = n / 100;
        int ten = (n / 10) % 10;
        int one = n % 10;
        if ((hund - ten) == (ten - one)) {
            flag = true;
        }
        return flag;
    }
}
