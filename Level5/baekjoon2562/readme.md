Baekjoon2562 최대값 구하기 (배열)
====

[Baek](https://www.acmicpc.net/problem/2562)

```
public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int [] num =new int[9];

        for(int i=0;i<=num.length;i++){
            num[i]=Integer.parseInt(br.readLine()); 
        }
        int max_num = num[0];//이전 자연수 저장
        int nArrry = 0; // 최대값의 인덱스 저장 

        for(int i=0;i<num.length;i++){
            if(max_num<num[i]){
                max_num = num[i];
                nArray =i;
            }
        }
        bw.write(num[result] + "\n" + (result +1));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
```





[BufferedReader,BufferedWriter출처](https://mebadong.tistory.com/12)
# Buffer 
* BufferedReader와 BufferedWriter는 버퍼를 이용해서 읽고 쓰는 클래스, 버퍼를 사용 or 이용하기 때문에 이 함수를 이용하면 입출력의 효율이 좋아진다. 

<img src = "https://k.kakaocdn.net/dn/Yhi12/btqEwRqWyaR/DUVPhRNi5pUcTvH4YB1kkK/img.png" width=100% height="200px">

키보드나 모니터와 같은 외부 장치와의 데이터 입출력은 CPU의 성능 차이가 크기 때문에 버퍼를 두고 모아두었다. 한번에 전송하는 것이 효율적이다. 

# BufferedReader 
* BufferedReader는 개행 문자를 경계로 인식하고 받은 데이터가 String으로 고정되기 때문에 데이터를 따로 가공해야 하는 번거로움이 있지만 Scanner에 비해 빠르다는 장점이 있다. 10,000,000개의 0~1023범위의 정수를 한 줄씩 읽고 입력으로 받은 정수의 합을 출력하는 프로그램을 구현할 떄 BufferedReader와 Scanner의 차이는 밑의 표와 같음 

|입력방식|수행 시간(초)|
|----------|----------|
|java.util.Scanner|6.068|
|java.io.BufferedReader|0.934|

# BufferedReader사용법 
* BufferedReader의 readLine()을 사용하면 데이터를 한 줄씩 읽을 수 있다. readLine()의 반환 값은 String이기 때문에 다른 타입으로 사용하려면 형 변환을 필수로 해주어야 한다. 

``` 
import java.io.*;
    class BufferedReaderEx{
        public static void main(String[] args){
            try{ //BufferedReader를 사용할 경우 예외처리 혹은 throws IOException을 해주어야한다. 
                //콘솔로 입력받는 경우 
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                //파일에서 입력을 받는 경우 
                FileReader fr = new FileReader("파일명");
                BufferedReader br_f = new BufferedReader(fr);

                int num = Integer.parseInt(br.readLine());
                br.close();//입출력이 모두 끝나면 닫아주어야한다. 

                String line = "";
                for(int i=1;(line = br_f.readLine()) != null; i++){
                    System.out.println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }

```
한 줄씩 읽어오는 것이 아닌 공백 단위로 끊어준다면 StringTokenizer의 nextToken()을 이용하거나 String의 split()을 이용하면 됨 

BufferedReader의 메소드들 
|Modifier an Type|Method and Description|
|void|close() : 입력스트림을 닫고 사용하던 자원들을 해제한다.|
|void|mark(int, readAheadLimit): 스트림의 현재 위치를 마킹한다.|
|boolean|markSupported() :스트림이 mark기능을 지원하는지 boolean으로 알려준다. |
|int|read() : 한 글자만 읽어 아스키코드 값으로 반환한다.|
|int|read(char[] cbuf,int offset,int length): cbuf의 offset위치부터 length의 길이 만큼 문자를 스트림으로부터 읽어온다.|
|String|readLine() : 한 줄을 읽어온다.|
|boolean|ready() : 입력 스트림이 사용할 준비가 되어있는지 알려준다.|
|void| reset(): 읽는 위치를 처음으로 변경한다. 마킹이 되어있을 경우 마킹된 위치로 변경된다.|
|long| skip(long n): n개의 문자를 건너뛴다.|


# BufferedWriter
* System.out.print()와 동일한 기능을 하는 클래스로 버퍼를 이용하기 때문에 속도가 빠르다. System.out.println()처럼 개행을 동시에 해주기 않기 때문에 개행을 하려면 write에 "\n"을 넣어주거나 newLine() 사용해야 한다. 

# BufferedWriter 사용법

```
import java.io.*

class BufferedWriterEx{
    public static void main(String[] args){
        BufferedWriter bw = new BufferedWriter(new FileWriter("파일명"));
        bw.write("출력할 내용\n");
        bw.newLine(); // 개행
        bw.flush(); //남은 데이터 모두 출력 
        bw.close(); //스트림 닫기 
    }
}
```
BufferedWriter를 사용 후 닫기 전에 flush()를 이용하여 버퍼를 비워주어야한다. 