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
switch case를 사용하여 만들어주었다. <br>
<img src="https://postfiles.pstatic.net/MjAyMTA3MDdfMjk5/MDAxNjI1NjQ3MjYwOTY4.0X4xcCrNEYHqHsrkt_8uGMKeg09-4tnHlgMjg2KWxVgg.SPFX0u-o2geJrL-a4H5dvpnNCwB5GJ8LrbpKBm1LV1wg.PNG.hans9839/image.png?type=w773" width="100%" height="300"></img></br>