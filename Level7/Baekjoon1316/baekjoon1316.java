import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int rNum = Integer.valueOf(bf.readLine());
        int count =0;
        
        for(int i=0;i<rNum;i++){
        String wordLine=bf.readLine();
            if(check(wordLine)==true)
                count++;
        }
        bf.close();
        System.out.println(count);
        }
        public static boolean check(String word){
            boolean checkArr[] = new boolean[26];
            int preCheck = word.charAt(0)-97;
            checkArr[preCheck] = true; 
            for(int i=1;i<word.length();i++){
                int curCheck = word.charAt(i)-97;                
                if(checkArr[word.charAt(i)-97]==true && preCheck!=curCheck){
                    return false;
                }
                else {
                    checkArr[word.charAt(i)-97]=true;
                    preCheck = curCheck;
                    continue;
                }
                    
            }

            return true;
        }
    }

