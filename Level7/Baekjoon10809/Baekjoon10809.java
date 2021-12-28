import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[26];
        String alphabet=br.readLine();

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = -1;
        }
        for(int i=0;i<alphabet.length();i++){
            char text = alphabet.charAt(i);
            arr[text-'a']= i;
        }
        for(int val : arr){
            System.out.print(val+" ");   
        }

    }
}
