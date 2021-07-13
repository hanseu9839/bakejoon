import java.util.Scanner;



public class baekjoon2562 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []intArray = new int[9];
        
        for(int i=0;i<intArray.length;i++){
            intArray[i]=sc.nextInt();
        }
     
        int nArray=0;
        int max=0;
        for(int i=0;i<intArray.length;i++)
        {
            if(max<intArray[i])
            {    max = intArray[i];
                 nArray = i;
            }   
        }
        System.out.println(max);
        System.out.println(nArray+1);
        sc.close();
    }
}
