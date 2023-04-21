import java.util.*;

public class Week2Stones {
    static int stoneFunc(int[] A, int w) {
        int placeHolder = 0;
        int dummy = 0;

        for (int i : A) {
            if(i>w) {
                return 0;
            }

            if(placeHolder+i>w) {
                dummy++;
                continue;
            }
            if (placeHolder < w && !(placeHolder+i>w)) {
                dummy++;
                placeHolder += i;
            }
            if (placeHolder == w) {
                dummy--;
                break;
            }
        }

        return dummy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println(stoneFunc(A, w));
    }
}