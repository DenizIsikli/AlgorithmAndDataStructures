import java.util.Scanner;

public class Week0ChristmasPresents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int L = scanner.nextInt();
        int O = scanner.nextInt();
        boolean dummy = false;

        if(A < O && A < L) {
            System.out.println("Anna");
            dummy = true;
        }
        if (L < A) {
            System.out.println("Laura");
            dummy = true;
        }
        if(O < A || O < L) {
            System.out.println("Oscar");
            dummy = true;
        }
        if(!dummy){
            System.out.println("NONE");
        }
    }
}