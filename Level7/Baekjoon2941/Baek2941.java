import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String alpha = bf.readLine();

        int count =0;

      for(int i=0;i<alpha.length();i++){
          char ch= alpha.charAt(i);
          if(ch == 'c' && i<alpha.length()-1)
          {
              if(alpha.charAt(i+1)=='=' || alpha.charAt(i+1)=='-')
                i++;
          }else if(ch=='d'&&i<alpha.length()-1){
              if(alpha.charAt(i+1)=='z'&&i<alpha.length()-2){
                if(alpha.charAt(i+2)=='='){
                    i+=2;
                }
              }else if(alpha.charAt(i+1)=='-')
                    i++;
          } else if(ch=='l'&&i<alpha.length()-1 || ch=='n'&&i<alpha.length()-1){
              if(alpha.charAt(i+1)=='j')
              i++;
          }else if(ch=='s'&&i<alpha.length()-1||ch=='z' && i<alpha.length()-1){
              if(alpha.charAt(i+1)=='=')
              i++;
          }
          count++;
      }
      System.out.println(count);
    }
}