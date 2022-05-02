package Bakejoon2447;

import java.util.*;
import java.util.Scanner;

public class Baekjoon2447 {
    static char arr[][]; // n크기의 2차원 배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        arr = new char[num][num];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(arr[i],' ');
        }
        star(0,0,num);
    }
    public static void star(int x, int y, int n){
        int div = 0;
        if(n==1){
            arr[x][y] = '*';
            return ;
        }
        div = n/3;
        for(int i=0;i<3;i++){
            for(int j=0;i<3;j++){
                if(i==1&&j==1) continue;
                star(x+(i*div),y+(j*div),div);//(9,0,9) (9,18,9)  (9,18,3), (9,18,1) 
            }
        }
    }
}
