import java.util.*;

public class Assignment2 {

    public static boolean bfs(ArrayList<Integer>[] paths, boolean[] visited, int start, int target) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (curr == target) {
                return true;
            }

            for (int next : paths[curr]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        //basically same setup as week 6 exercise regarding vertices and edges
        Scanner scanner = new Scanner(System.in);

        //input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //list for vertices
        ArrayList<Integer>[] paths = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            paths[i] = new ArrayList<Integer>();
        }

        //edges
        for (int i = 1; i <= m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            paths[u].add(v);
            paths[v].add(u);
        }


        //use BFS to search for a path from a to b
        boolean[] visited = new boolean[n+1];
        if(bfs(paths, visited, a, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}