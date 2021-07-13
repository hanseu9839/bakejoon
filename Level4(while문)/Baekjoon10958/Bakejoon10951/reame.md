BaekJoon 10951 
======
#StringTokenizer 
StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스다. 그렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 부른다. <br/><br/>

StringTokenizer를 사용하기 위해서는 Java.util.String.Tokenizer를 import해야한다. 사용법은 굉장히 쉽다. 사용하는 메소드도 몇개 없음. 

|생성자|설명|
|-----------------|---------------------|
|public StringTokenizer(String str)|전달된 매개변수 str을 기본 (default)delim으로 분리합니다. 기본 delimiter는 공백 문자들인 "\t\n\r\t"입니다. |
|public StringTokenizer(String str,String delim)|특정 delim으로 문자열을 분리합니다.|
|public StringTokenizer(String str,String delim,boolean returnDelim)|Str을 특정 delim으로 분리시키는데 그 delim까지 token으로 포함할지를 결정합니다. 그 매개변수가 returnDelim로 true일시 포함, false일 떈 포함되지 않는다.|
