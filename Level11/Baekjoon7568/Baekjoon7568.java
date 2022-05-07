package Baekjoon7568;

import java.io.IOException;
import java.util.Scanner;


public class Baekjoon7568 {
    public static void main(String[] args) throws IOException{
        
        Scanner scan = new Scanner(System.in);
        int rN= scan.nextInt();
        int person[][] = new int [rN][2]; // 배열을 생성하여 person수 만큼 배열을 생성해주었다.
        for(int i=0;i<rN;i++){           
           person[i][0]=scan.nextInt(); //몸무게
           person[i][1]=scan.nextInt(); //키
        }

        for(int i=0;i<rN;i++){//첫번째 사람 반복 루프
            int rank=1;
            for(int j=0;j<rN;j++){//비교 해주기 
                if(i==j) continue;//같은 사람인 경우 비교 x
                if(person[i][0]<person[j][0]&&person[i][1]<person[j][1]){//각각의 몸무게,키비교 
                    rank++;
                }
            }
            System.out.println(rank);
        }
    }
}
