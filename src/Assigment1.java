import java.util.*;

public class Assigment1 {
    public static void priceHunter(int[] A) {
        Arrays.sort(A);
        int discout = 0;
        int n = A.length;

        System.out.println(n);

        for(int i = n -1; i >= 2; i-=3) {
            //Udregner
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] A = new int[n];


        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        priceHunter(A);
    }
}
