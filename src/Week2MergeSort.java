import java.util.*;

public class Week2MergeSort {
    public static void mergeSort(ArrayList<Integer> A) {
        Collections.sort(A);

        //ArrayList to Array conversion using "toArray"
        Integer[] tempList = A.toArray(new Integer[0]);

        for(int i : tempList) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> A = new ArrayList<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int Num_A = scanner.nextInt();
            A.add(Num_A);
        }

        mergeSort(A);
    }
}
