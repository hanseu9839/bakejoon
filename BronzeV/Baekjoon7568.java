import java.util.ArrayList;
import java.util.Scanner;
class Person {
    public int weight;
    public int height;
    Person(int weight,int height){
        this.weight = weight;
        this.height = height;
    }
 
}
public class Baekjoon7568 {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Person> persons = new ArrayList<>();
        int []rN = new int[n];
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            rN[i]=b;
            persons.add(new Person(a, b));
        }
        for(int i=0;i<n;i++){
            int rank = 1;
            for(int j=0;j<n;j++){
                Person p1 =persons.get(i);
                Person p2 = persons.get(j);
                if(p2.height>p1.height && p2.weight>p1.weight) rank++; 
            }
            rN[i]=rank;
        }
        for(int x : rN){
            System.out.print(x+" ");
        }
    }
}
