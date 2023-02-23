import java.sql.Array;
import java.util.*;

public class Week4Stack {
    public static void Stack(LinkedList<String> A) {
        int temp = 0;

        for(String str : A) {
            if (A.contains("O")) {
                temp++;
                System.out.println(temp);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        LinkedList<String> A = new LinkedList<>();

        for (int i = 0; i < n+1; i++) {
            String Num_A = scanner.nextLine();
            A.add(Num_A);
        }

        Stack(A);
    }
}
