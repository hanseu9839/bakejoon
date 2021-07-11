*백준 알고리즘 시험성적*
==========
[bakejoon9498](https://www.acmicpc.net/problem/9498)

```
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
```
switch case를 사용하여 만들어주었다. 
<img src="C:\Users\hans9\Desktop\Bakejoon\Level2(IF문)\bakejoon9498" width="40%"height="100px"></img></br>