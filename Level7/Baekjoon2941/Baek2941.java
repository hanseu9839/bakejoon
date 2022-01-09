import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String alpha = bf.readLine();

        int count =0;

        for(int i=0;i<alpha.length();i++){
            char one = alpha.charAt(i);
            
            if(one=='c'){
                if(i<alpha.length()-1){
                if(alpha.charAt(i+1) == '=')
                 i++;
                else if(alpha.charAt(i+1) == '-')
                 i++; 
                }
            }else if(one=='d'){
                if(i<alpha.length()-1){
                if(alpha.charAt(i+1)=='z')
                if(i<alpha.length()-2){
                  if(alpha.charAt(i+2)=='=')
                  i+=2;
                }
                else if(alpha.charAt(i+1)=='-')
                    i++;
                }
            }else if(one=='l'){
                if(i<alpha.length()-1){
                if(alpha.charAt(i+1)=='j')
                    i++;
                }
            }else if(one=='n'){
                if(i<alpha.length()-1){
                if(alpha.charAt(i+1)=='j')
                    i++;
                }
            }else if(one=='s'){
                if(i<alpha.length()-1){
                if(alpha.charAt(i+1)=='=')
                    i++;
                }
            }else if(one=='z'){
                if(i<alpha.length()-1){
                if(alpha.charAt(i+1)=='=')
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
