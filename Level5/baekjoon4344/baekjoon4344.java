import java.util.Scanner;

/*
    1. Scanner 함수를 선언해준다.
    2. Scanner를 통해서 몇명의 점수를 받을 것인지 변수로 받아준다.
    3. int 배열을 선언하여 점수를 저장할 배열을 선언해준다.
    4. int sum, average변수를 선언 해준다. // 평균 , sum 
    5. 배열 .length를 통해서 해줌 
    6. cnt를 통해서 조건이 맞으면 한명씩 출력 
    7. 그 후 cnt를 전체 수로 나누어 준다. 
*/

public class baekjoon4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int caseNum = scan.nextInt();
        int[][] score = new int[caseNum][];
        double average = 0.0;
        double ratio;

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            int cnt = 0;
            int personNum = scan.nextInt();
            score[i] = new int[personNum];
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = scan.nextInt();
                sum += score[i][j];
            }
            average = ((double) sum / personNum);
            for (int j = 0; j < score[i].length; j++) {
                if (score[i][j] > average)
                    cnt++;
            }
            ratio = ((double) cnt / personNum) * 100;
            System.out.println(String.format("%.3f", ratio) + "%");
        }
        scan.close();
    }
}
