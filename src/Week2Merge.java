import java.lang.reflect.Array;
import java.util.*;

public class Week2Merge {
    public static void mergeSort(ArrayList<Integer> N, ArrayList<Integer> M) {
        N.addAll(M);
        Collections.sort(N);

        //ArrayList to Array conversion using "toArray"
        Integer[] tempList = N.toArray(new Integer[0]);

        for(int i : tempList) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> N = new ArrayList<Integer>();
        ArrayList<Integer> M = new ArrayList<Integer>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int Num_N = scanner.nextInt();
            N.add(Num_N);
        }

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int Num_m = scanner.nextInt();
            M.add(Num_m);
        }

        mergeSort(N,M);
    }
}