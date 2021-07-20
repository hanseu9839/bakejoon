package Baekjoon4673;

import jdk.javadoc.internal.tool.Main;

public class Baek4673 {
    static final int MAX = 10001;

    public static void main(String[] args) {
        int[] arr = new int[MAX];
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
