import java.util.Scanner;

public class bekjoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nArray = sc.nextInt();
        double[] grade = new double[nArray];
        double max = 0;
        double sum = 0;
        double firstAverage = 0;
        double average;
        for (int i = 0; i < grade.length; i++) {
            grade[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
            if (max < grade[i])
                max = grade[i];
        }
        firstAverage = sum / nArray;
        average = (firstAverage / max) * 100;
        System.out.println(Math.round(average * 100) / 100.0);
    }
}