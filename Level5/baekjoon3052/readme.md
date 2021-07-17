baekjoon3052 나머지 구하기 
=======
[Baekjoon](https://www.acmicpc.net/problem/3052)
```
import java.util.Scanner;


public class baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int arr[] = new int[10];
        boolean flag;
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt()%42;
        }
        for(int j=0;j<arr.length;j++){      
            flag = false;
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]==arr[j]){
                    flag = true;
                    continue;
                }
            }
            if(flag == false){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
```


1. Scanner 를 통해서 사용자에게 입력받을 것을 받는다. 
2. 나머지 10개를 넣어주기 위해서 arr[10]을 만들어주었다. 
3. boolean flag를 통해서 해당하는 나머지가 똑같은 것이 없다면 더해줄 변수를 만들어주었다. 
4. cnt 변수를 통해서 해당하는 배열에 해당하는 나머지가 없다면 증가를 시켜준다. 
5. for문을 통해서 arr[i]를 사용자에게 nextint를 통해서 42로 나눈 나머지를 배열에 넣어준다. 
6. flag를 기본적으로 false를 만들어준다. 이유는 flag를 통해서 true일 떄는 해당하는 배열과 같은 나머지가 있는 것이기 떄문에 count를 늘려주지 말아야하는데 이때 flag를 통해서 이것을 제어 해준다. 
7. continue를 통해서 flag가 true면 위에있는 가장 가까운 반복문으로 들어간다. 
```
import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner;
 /** * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오. 
 * @author imj10 
 * 
 */
  public class Balance { 
      public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in); 
      List<Integer> list = new ArrayList<Integer>(); 
      int count = 0; 
      for ( int i=0; i <10; i++ ) { 
          int input = sc.nextInt(); 
          if ( !list.contains(input%42) ) 
          {
               list.add(input%42); count++; 
          } 
        } 
        System.out.println(count); 
      } 
}
```
# Array(배열)
- 여러 데이터를 하나의 이름으로 그룹핑해서 관리 하기 위한 자료구조. index와 값의 쌍으로 구성 
- index는 값에 대한 유일무이한 식별자(마치 주민번호)(리스트에서 인덱스는 몇 번째 데이터인가 정도의 의미를 가짐)
- 논리적 저장 순서와 물리적 저장 순서가 일치 => index로 해당 원소를 접근할 수 있다.
- 연속된 메모리의 공간으로 이루어져 있다.
- 배열은 정의와 동시에 길이를 지정하며 길이를 바꿀 수 없다. 

## 장점 

- 인덱스를 통한 검색이 용이함 
- 연속적이며 메모리 관리가 편하다.

## 단점 

- 크기가 고정되어 있기 떄문에 어떤 엘리먼트가 삭제되면, 삭제된 생태를 빈 공간으로 남겨두어야 한다. => *메모리 낭비*
- 정적이므로 배열의 크기를 컴파일 이전에 정해주어야 함 
- 컴파일 이후 배열의 크기를 변동 할 수 없다. 

# List 

- 리스트는 순서가 있는 엘리먼트의 모임으로 배열과는 다르게 빈 엘리먼트는 절대 허용하지 않는다.
- 리스트는 배열이 가지고 있는 인덱스라는 장점을 버리고 대신 빈틈없는 데이터의 적재라는 장점을 취함 
- 리스트에서 인덱스는 몇 번째 데이터인가 정도(순서)의 의미를 가진다.(배열 - Array에서의 인덱스는 값에 대한 유일무이한 식별자) 
- 빈엘리먼트는 혀용하지 않는다. => 자바에서는 허용하는 경우가 있다.
- 순차성을 보장하지 못하기 때문에 spacial locality보장이 되지 않아서 cash hit가 어렵다.(데이터 개수가 확실하게 정해져 있고, 자주 사용된다면 array가 더 효율적)
- 불연속적으로 메모리 공간을 차지
- 포인터를 통한 접근 

## 장점 
- 포인터를 통하여 다음 데이터의 위치를 가르켜고 있어 삽입 삭제의 용이
- 동적이므로 크기가 정해져있다.
- 메모리의 재사용 편리
- 불연속적이므로 메모리 관리의 편리 

## 단점
- 검색 성능이 좋지 않다.
- 포인터를 통해 다은 데이터를 가르키므로 추가적인 메모리 공간 발생.

|    |추가/삭제|조회|
|------|---------|--------|
|Array|느림|빠름|
|List|빠름|느림|


리스트는 배열의 한계 때문에 만들어진 자료형이다. 배열을 사용하기 위해서는 크기를 정해야 한다. 그런데 프로그래밍 중 크기를 알 수 없는 경우가 더 많다. List 는 메모리가 허용하는 한 계속해서 추가 할 수 있도록 만든 자료형 클래스이다. 

<hr/>

### Java.util.List는 인터페이스 클래스이며 Java.util.Collection 인터페이스를 구현한 것입니다. List를 사용하기 위해서는 아래 클래스들중 하나로 인스턴스화 할 수 있습니다.

``` 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

List listA = new ArrayList();
List listB = new LinkedList();
List listC = new Vector();
List list[] = new Stack();
```

#값 추가하고 꺼내는 방법 - add,get
### 값들을 추가하고 인덱스에 해당하는 값을 하나씩 가져오거나 모든 데이터를 꺼내는 방법. 값을 추가하기 위해서는 add()함수를 사용한다. 아래 그림처럼 텍스트값 3개를 추가. 제일 아래에 있는 add()함수는 형태가 틀리다. 첫번째 인수로 요소를 넣었다. 요소값을 넣고 데이터를 추가하게 되면 해당 요소에 값을 교체하는 것이 아니라 추가하고 데이터들이 하나씩 밀리게 된다. 


```
List listA = new ArrayList();

listA.add("김삿갓");
listA.add("홍머리");
listA.add(new String("홍길동"));

listA.add(1,"1번째 요소값");
```



### 인덱스로 값을 조회하고 싶다면 get(index)함수를 사용하며 된다. 하나씩 조회하고 싶을 떄 사용하는 방법이고 모든 데이터를 전부 출력하고 싶으면 lterator와 For loop문을 이용한다. List클래스의 iterator()함수로 lterator객체를 리턴받아 사용합니다. 

```
String element0 = list.get(0).toString();
String element1 = list.get(1).toString();
String element2 = list.get(2).toString();

lterator iterator = listA.lterator();

while(lterator.hasNext()){
    String element = (String) lterator.next();
}

for(Object object: listA){
    String element = (String) object;
}
```

# 값 삭제하는 방법 - remove 

### 객체를 삭제하는 방법은 두가지가 있다. 인덱스를 이용하는 방법과 동일한 오브젝트를 인수로 넘기면 검색해서 삭제시켜 줍니다. 오브젝트를 이용해서 삭제하게 되면 삭제 결과가 성공인지 실패인지만 알려주고 인덱스로 삭제하게 되면 어떤 데이터를 삭제했는지 리턴값으로 알려준다. 


- remove(Object element)
- remove(int index)

```
System.out.println(listA.remove(0));
System.out.println(listA.remove("홍길동"));


```

# 값이 있는지 확인하는 방법 - contains 

### 리스트안에 있는 데이터중 찾고자 하는 값이 존재하는지 확인할수 있는 함수가 contains 입니다. 함수 인수로 오브젝트를 넘기게 되면 boolean 값을 리턴하게 됩니다. 

```
System.out.println(listA.contains("홍길동"));
```

# 해당 위치 앞에 값을 집어넣고 싶을 때 

### 위에서 값을 추가할 때 add()함수의 첫번째 인수로 인덱스를 넘기게 되면 해당 위치 앞에 추가 된다고 했습니다. 위치를 알고 있을 떄는 이렇제 지정하면 되는데 알 수 없을 때는 어떻게 해야하는가? indexof()함수를 이용해서 위치값을 찾은 뒤 add()함수를 이용 

```
int index = listA.indexOf("홍길동");
listA.add(index, "홍길동 앞에 값 추가");
```



# Reference 
[녹두장군tistory](https://mainia.tistory.com/2323
https://velog.io/@adam2/)<br/>
[자료구조(Array와 List)](Array%EC%99%80-List%EA%B7%B8%EB%A6%AC%EA%B3%A0-Java-List)