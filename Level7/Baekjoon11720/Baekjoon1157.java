import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Baekjoon1157{
    public static void main(String[] args) throws IOException{
        int alpha[] = new int[26];
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(input);
        
        try {
        String word = bf.readLine().toUpperCase();
        for(int i=0;i<word.length();i++){
          alpha[word.charAt(i)-65]++;
        }   
        } catch (Exception e) {
         e.printStackTrace();   
        }
        int max=0;
        char str ='?';
        for(int i=0;i<alpha.length;i++){
            if(max<alpha[i]){
                max = alpha[i];
                str = (char)(i+65);
            } else if(max == alpha[i]){
                str = '?';
            }
        }
        System.out.println(str);

    }
}

/*
문제풀이
가장 많이 사용한 알파벳의 숫자들을 저장해주기 위해 배열을 선언해주었다. 
여기서 좀 많이 헷갈려서 선언은 해주었는데 배열을 Integer형으로 선언해주어 각각의 숫자가 저장될 수 있도록 만들어주었어야했다.
하지만 나는 char타입으로 선언해주어 각각의 알파벳을 넣어주었다. 
이 부분이 처음 내가 문제를 풀지 못한 이유였다. 이렇게 해줄 수 있는 이유는 아스키코드 덕분이다. 
아스키코드는 대문자 A가 숫자형으로는 65인데 이를 바탕으로 배열의 각각 인덱스에 26개의 알파벳을 넣어줄 수 있는 공간을 메모리에 만든다. 
이를 바탕으로 각각의 인덱스가 숫자형으로 내가 입력해 준 알파벳값에서 -65를 해준다면 적절한 알파벳 인덱스로 들어가 내가 입력해준 단어에 해당하는 값이 하나씩 올라갈 수 있다. 
*/