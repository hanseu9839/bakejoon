import java.math.BigInteger;
import java.util.*;

public class Baekjoon1271 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        BigInteger m = scan.nextBigInteger();
        scan.close();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}
