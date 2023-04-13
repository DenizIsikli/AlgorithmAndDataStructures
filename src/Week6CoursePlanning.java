import java.util.ArrayList;
import java.util.Scanner;

public class Week6CoursePlanning {
    private static int findDepth(int u, ArrayList<Integer>[] graph, int[] depth) {
        if (depth[u] != 0) {
            return depth[u];
        }
        int maxDepth = 1;
        for (int v : graph[u]) {
            maxDepth = Math.max(maxDepth, findDepth(v, graph, depth) + 1);
        }
        depth[u] = maxDepth;
        return maxDepth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read input
        int n = sc.nextInt();
        int m = sc.nextInt();

        // construct graph
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
        }

        // find the maximum depth
        int[] depth = new int[n+1];
        for (int i = 1; i <= n; i++) {
            depth[i] = findDepth(i, graph, depth);
        }

        // output result
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = Math.max(result, depth[i]);
        }
        System.out.println(result);
    }
}