package Baekjoon1436;

import java.util.Scanner;

public class Baekjoon1436 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int num = 666;
        int count = 0;
        while(count < N ){
            String sNum =Integer.toString(num);
            if(sNum.contains("666")){
                count++;
            }
            num+=1;
        }
        num-=1;
        System.out.print(num);
        in.close();
    }
}
