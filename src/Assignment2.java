import java.util.*;

public class Assignment2 {

    public static boolean dfs(ArrayList<Integer>[] adList, int start, int target, boolean[] visited) {
        Stack stack = new Stack();
        stack.push(start);

        while (!stack.isEmpty()) {
            int curr = stack.pop();
            visited[curr] = true;

            if (curr == target) {
                return true;
            }

            for (int neighbor : adList[curr]) {
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Basically same setup as week 6 exercise regarding vertices and edges
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Adjacency list for vertices
        ArrayList<Integer>[] adList = new ArrayList[n+1];
        for(int i = 1; i <= n; i++) {
            adList[i] = new ArrayList<Integer>();
        }

        // Edges
        for(int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            // Undirected edge, going both ways
            adList[u].add(v);
            adList[v].add(u);
        }

        // use DFS to search for a path from a to b
        boolean[] visited = new boolean[n+1];
        if(dfs(adList, a, b, visited)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}