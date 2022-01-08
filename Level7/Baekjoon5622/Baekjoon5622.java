import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5622{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine();
        int wordSum=0;
        for(int i=0;i<word.length();i++){
           char oneWord=word.charAt(i);
           String UpWord = Character.toString(oneWord);
        switch(UpWord.toUpperCase()){
            case "A":
            case "B":
            case "C":
            wordSum+=3;
            break;
            case "D":
            case "E":
            case "F":
            wordSum+=4;
            break;
            case "G":
            case "H":
            case "I":
            wordSum+=5;
            break;
            case "J":
            case "K":
            case "L":
            wordSum+=6;
            break;
            case "M":
            case "N":
            case "O":
            wordSum+=7;
            break;
            case "P":
            case "Q":
            case "R":
            case "S":
            wordSum+=8;
            break;
            case "T":
            case "U":
            case "V":
            wordSum+=9;
            break;
            case "W":
            case "X":
            case "Y":
            case "Z":
            wordSum+=10;
            break;
            default : wordSum+=0;
            break;
        }
    }
    System.out.println(wordSum);
    }
}