package Baekjoon4673;

public class Baekjoon4673 {
    public static final int MAX = 10001;

    public static void main(String[] args) {

        boolean[] check = new boolean[MAX];
        int notSelfNumber = 0;
        for (int i = 0; i < check.length; i++) {
            notSelfNumber = loopSum(i);
            if (notSelfNumber < MAX) {
                check[notSelfNumber] = true;
            }
        }
        for (int i = 1; i < check.length; i++) {
            if (!check[i])
                System.out.println(i);
        }
    }

    static int loopSum(int num) {
        int sum = num;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
