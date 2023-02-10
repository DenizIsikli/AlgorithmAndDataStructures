import java.util.*;

public class Week2BinarySearch {
    static int binarySearch(int[] A, int v) {
        int n = A.length;
        int mid = n/2;

        if (A[mid] == v) {
            return A[v];
        } else if(A[mid] < v) {
            A[0] = A[mid+1];
        } else {
            A[n-1] = A[mid-1];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] A = new int[n];
        int[] Q = new int[m];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            Q[i] = scanner.nextInt();
        }

        System.out.println(binarySearch(A, m));
    }
}
