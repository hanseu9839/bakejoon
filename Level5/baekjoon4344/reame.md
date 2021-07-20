Baekjoon 4344 평균은 넘겠지 
####

[Baekjoon4344](https://www.acmicpc.net/problem/4344)
```
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
```


1. caseNum을 선언해주어 몇번의 케이스들을 입력받을 것인지 정해주어 반복해준다. 
2. int자료형 score변수는 2차원배열을 만들어주어 각각의 케이스를 저장할 배열을 만들어준다. String 자료형은 그자체로 Java에서 객체 취급하기때문에 1차원 배열로 선언 해주어도 되는 것이였음 사실상 내부에서는 2차원배열과같음 
3. 평균을 저장해줄 변수와 평균을 넘는 사람들의 비율을 저장하기 위한 변수 두개를 선언해줌 
4. 이중 for문을 사용해주어 각각의 케이스에 대해서 점수를 넣을 수있게해준후 각각의 케이스에 대해서 평균을 구해 비교해준 후 비율을 구한다. 
5. 총합과, 평균보다 큰 사람들의 수를 저장할 변수를 하나씩 선언해주었다. 반복할 케이스 하나하나에 대한 성적에대한 길이에 대해서 사용자게에게 scanner를 통해서 입력받는다.
6. 그 후 score[i]에 다가 new int[personNum]을 통해서 몇개나 생성해줄 것인지 지정한다. 
7. 2차원 배열에 있는 [i][j]안에 점수를 넣어준다. 그 후 sum 을 통해서 총합을 저장시켜줌 
8. average변수에 구한 핪과 사람을 나누어 평균을 구해 준후 if문을 통해서 평균이 넘는 사람이 몇명인지 cnt++을 통해서 구한다. 
9. 그 후cnt를 통해서 총 인원수에서 cnt를 나누어준 후 *100 을 해주면 비율이 나온다.
10. String.format함수를 통해서 소수점 3자리수까지 출력되게 끔 만들어주었다. 