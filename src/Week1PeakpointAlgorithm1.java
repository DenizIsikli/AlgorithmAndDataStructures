import java.util.*;

public class Week1PeakpointAlgorithm1 {
     static int Algorithm1(int[] A, int n) {
        if(A[0] >= A[1]) {
            return 0;
        }

        for (int i = 1; i < n-2; i++) {
            if(A[i] >= A[i-1] && A[i] >= A[i+1]) {
                return i;
            }
        }

        if(A[n-1] >= A[n-2]) {
            return n-1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println(Algorithm1(A, n));
    }
}
