# 손익분기점
### 월드 전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다. 
### 예를 들어 A= 1000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열대 생산하는 데는 총 1700만원이 든다. 노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매 비용)이 총 비용(=고정 비용+가변비용)보다 많아지게 된다. 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.



```
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

```

### 해설을 하자면 손익분기점을 처음 할 때 비용의 값이 더해지기 때문에 무조건 손익분기점이 생기려면 판매가격이 무조건 비용보다 커야지만 손익분기점이 생길 수 있는데 이를 사용자가 잘못 사용할경우 -1 을 출력하기 위해 이를 판매가격을 기준으로 조건문을 작성해주었다. 만약 가변비용이 판매비용보다 크다면 else문을 가서 -1을 출력하도록 해주었다. 
### 여기서 고민을 많이 했는데 처음 코드를 작성하였을 때는 기존에 1070만원이면 이것을 70만원이 만드는데 들어가는 비용이니깐 이를 더해주어 while문에서 계속 비교해주게끔 만들어주었는데.. 생각대로 잘되지 않았다. 그래서 판매비용에서 가변비용을 빼면 그게 순수익이니깐 그 순수익을 고정비용과 비교해준 후 한대 팔릴때마다를 가정하여 산술증감을 사용하여 변수를 계속해서 증가시켜주어 결국엔 더 크게 되었을 경우 그 증가시켜준 변수를 출력시켜주게 만들어 사용자가 몇대 이상 만들어야 이익을 얻을 수 있는지 만들어주었다. 