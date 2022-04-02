# 손익분기점 문제 
월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.

예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.

노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다. 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.

A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.

````
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

````
# 문제 풀이 
### 고정되어 이는 비용이 있고 나머지 하나는 가변적인 비용이 있다. 이렇게 해서 가변비용은 한대를 만들 때 드는 비용이다. 이를 통해서 rNum 을 선언해서 가변비용을 곱해준다. 근데 VARAIABLE_PRICE가 즉 판매비용이 가변비용보다는 높아야 결국엔 이익이 생기는 지점이 존재한다. 그렇기 때문에 VARIABLE_PRICE가 판매비용보다 작아야한다. 그 후 while문을 통해서 toalPrice 즉 판매비용에서 가변비용을 항상 빼주고 이를 rNum을 곱해서 toalPrice보다 클 경우를 지정해주면 이 때 while문의 조건을 충족하지 못한다면 rNum으로 출력시켜주는 것이다. 이렇게 해주면 이익이 생기는 지점을 출력하여 보여줄 수 있다. 