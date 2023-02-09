import java.util.*;

class Week1PeakpointAlgorithm3 {
    static int Algorithm3(int[] A, int i, int j) {
        int m = (i+j)/2;

        if(A[m] >= A[m-1] && A[m] >= A[m+1]) {
            return m;
        } else if(A[m-1] > A[m]) {
            return Algorithm3(A, i, m-1);
        } else if(A[m] < A[m+1]) {
            return Algorithm3(A,m+1,j);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int i = A[0];
        int j = A[n-1];

        for (int e = 0; e < n; e++) {
            A[e] = scanner.nextInt();
        }

        System.out.println(Algorithm3(A, i, j));
    }
}
