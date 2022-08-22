import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Room implements Comparable<Room>{
    int s;
    int e;
    public Room(int s,int e){
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Room o){
        if(this.e==o.e){
            return this.s-o.s;
        }
        return this.e - o.e;
    }
}
public class Baekjoon1931 {
    static int solution(ArrayList<Room> arr){
        int answer = 0;
        int st = 0;
        int et = Integer.MIN_VALUE;
        Collections.sort(arr);
        for(Room r : arr){
            st = r.s;
            if(st>=et){
                answer++;
                et = r.e;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        ArrayList<Room> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=0;i<N;i++){
            int s = scan.nextInt();
            int e = scan.nextInt();
            arr.add(new Room(s,e));
        }
        System.out.println(solution(arr));
        scan.close();
    }
}
