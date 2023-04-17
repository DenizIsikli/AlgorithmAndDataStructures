import java.util.*;

public class Assignment1 {
    public static void priceHunter(int[] A) {
        Arrays.sort(A);
        int discount = 0;

        // I move 3 indices backwards at a time from the end of the list,
        // so I start with the biggest numbers in A, since I sorted the array
        for(int i = A.length - 1; i >= 2; i-=3) {
            // I add the last element of the 3 integers,
            // since that is the cheapest out of the 3
            discount += A[i-2];
        }
        System.out.println(discount);
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