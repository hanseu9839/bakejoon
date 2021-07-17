import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _3052 {
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        int arr[] = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int temp=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine()) % 42;
        }
        for(int i=0;i<arr.length;i++){
            temp =0;
            for(int j=0;j<arr.length;j++){
                temp++;
            } 
            if(temp == 0)
                count++;           
        }
        System.out.println(count);
    }
}
