import java.util.*;

public class Assignment2 {

    public static boolean dfs(ArrayList<Integer>[] adList, int curr, int target, boolean[] visited) {
        // Base case
        if(curr == target) {
            return true;
        }

        visited[curr] = true;

        for (int neighbor : adList[curr]) {
            if (!visited[neighbor]) {
                if (dfs(adList, target, neighbor, visited)) {
                    return true;
                }
            }
        }

        return false; // no path found from start to end
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Adjacency list
        ArrayList<Integer>[] adList = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) {
            adList[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adList[u].add(v);
            adList[v].add(u);
        }

        // use DFS to search for a path from a to b
        boolean[] visited = new boolean[n+1];
        if(dfs(adList, a, b, visited)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
