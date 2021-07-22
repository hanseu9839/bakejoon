package Baekjoon4673;

public class Baek4673 {
    public static final int MAX = 10001;

    public static void main(String[] args) {
        boolean[] array = new boolean[MAX];
        int notSelfNumber = 0;
        for (int i = 0; i < array.length; i++) {
            notSelfNumber = dn(i);
            if (notSelfNumber < MAX)
                array[notSelfNumber] = true;
            while (!array[i]) {
                System.out.println(i);
                break;
            }
        }

    }

    static int dn(int n) {
        int Num = n;
        while (n != 0) {
            Num += n % 10;
            n = n / 10;
        }
        return Num;
    }
}
