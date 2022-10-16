import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon11651 {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point o) {
            if(o.y==this.y) return this.x - o.x;
            return this.y - o.y;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Point> pointArr = new ArrayList<>();
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Point p = new Point(x, y);
            pointArr.add(p);
        }
        Collections.sort(pointArr);
        for(Point p : pointArr){
            System.out.println(p.x+ " "+p.y);
        }
    }
}
