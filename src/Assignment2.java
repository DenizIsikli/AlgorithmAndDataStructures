import java.util.*;

public class Assignment2 {

    public static boolean bfs(ArrayList<Integer>[] paths, boolean[] visited, int start, int target) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (curr == target) {
                return true;
            }

            for (int next : paths.get(curr)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
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
        List<List<Integer>> paths = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            paths.add(new ArrayList<>());
        }

        //edges
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            paths.get(u).add(v);
            paths.get(v).add(u);
        }


        // use BFS to search for a path from a to b
        boolean[] visited = new boolean[n+1];
        if (bfs(paths, visited, a, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}