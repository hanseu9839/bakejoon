import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1712{
    public static void main(String[] args)  {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String price = br.readLine();
            StringTokenizer st = new StringTokenizer(price);
            int STATIC_PRICE = Integer.parseInt(st.nextToken());
            int VARIABLE_PRICE = Integer.parseInt(st.nextToken());
            int SALE_PRICE = Integer.parseInt(st.nextToken());
            int rNum =1;
            int totalPrice = STATIC_PRICE; 
            if(VARIABLE_PRICE<SALE_PRICE){
                while(totalPrice>=(SALE_PRICE-VARIABLE_PRICE)*rNum){
                    rNum++;
                }
                System.out.println(rNum);
            }else{
                System.out.println(-1);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}    
