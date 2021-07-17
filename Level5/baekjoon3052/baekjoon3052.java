import java.util.Scanner;

public class baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod[] = new int[10];
        int cnt = 0;
        int temp = 0;
        for (int i = 0; i < mod.length; i++) {
            mod[i] = sc.nextInt() % 42;
        }
        sc.close();
        for (int i = 0; i < mod.length; i++) {
            temp = 0;
            for (int j = i + 1; j < mod.length; j++) {
                if (mod[i] == mod[j])
                    temp++;
            }
            if (temp == 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}