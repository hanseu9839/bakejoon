package Baekjoon;

import java.util.Scanner;

/*
    알파벳 소문자, 대문자, 숫자 0~9중 하나가 주어졌을 때 , 주어진 글자의 아스키 코드값을 출력
    1. buffer or Scanner함수를 사용해준다. for문을 사용해야함 
    2. if문을 통해서 비교해준다. 
*/
public class Baekjoon11654 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int ch = sc.nextLine().charAt(0);
        sc.close();
        System.out.println(ch);
    }
}
