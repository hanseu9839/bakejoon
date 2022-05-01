package Baekjoon17478;

import java.util.Scanner;

public class Baekjoon17478 {
    static String sentenceTap="";
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("어느 한 컴퓨터 공학과 학생이 유명한 교수님을 찾아가 물었다.");
        sentence(n);
        scan.close();
    }
    private static void sentence(int n){
        String tap = sentenceTap;
        if(n==0){
            System.out.println(tap+" \"재귀함수가 뭔가요?\" ");
            System.out.println(tap+" \"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(tap+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(tap+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾와서 물었어.\" ");
            return ;
        }
        System.out.println(tap+" \"재귀함수가 뭔가요?\" ");
        System.out.println(tap+" \"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(tap+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(tap+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾와서 물었어.\" ");
        sentenceTap+="____";
        sentence(n-1);

    }
}
