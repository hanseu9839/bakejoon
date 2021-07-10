#Bakejoon14681
[Bakejoon](https://www.acmicpc.net/problem/14681)

```
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numX = scan.nextInt();
        int numY = scan.nextInt();

        if (numX > 0 && numY > 0) {
            System.out.println("1");
        } else if (numX > 0 && numY < 0) {
            System.out.println("4");
        } else if (numX < 0 && numY > 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
```
scan을 사용해주어 사용자에게 사분면의 값을 입력받게끔 만들어주었다. 

또한 각각의 양수,음수를 판단하여 if문을 써서 적절한 값의 사분면을 구분하여 출력시켜주었다. 

&& And연산자 || 는 OR연산자