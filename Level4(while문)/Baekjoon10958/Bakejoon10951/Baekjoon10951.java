
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon10951{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int a =0;
            int b =0;
            while(sc.hasNextLine()){
                StringTokenizer st = new StringTokenizer(sc.nextLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                bw.write(String.valueOf(a+b));
                bw.newLine();
            }
            bw.flush();
            bw.close();
            sc.close();
        
        }
}