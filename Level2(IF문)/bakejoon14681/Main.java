import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numX = scan.nextInt();
        int numY = scan.nextInt();

        if (numX > 0 && numY > 0) {
            System.out.println("1");
        } else if (numX > 0 && numY < 0) {
            System.out.println("4");
        } else if (numX < 0 && numY > 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}