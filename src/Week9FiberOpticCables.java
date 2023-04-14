import java.util.*;

public class Week9FiberOpticCables {
    static class Edge implements Comparable<Edge> {
        int u, v, w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }

        public int compareTo(Edge other) {
            return Integer.compare(this.w, other.w);
        }

        @Override
        public String toString() {
            return "(" + u + ", " + v + ", " + w + ")";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Edge[] edges = new Edge[m];
        for(int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            edges[i] = new Edge(u,v,w);
        }
        Arrays.sort(edges);

        int[] parent = new int[n+1];
        for(int i = 1; i < n; i++) {
            parent[i] = i;
        }

        int totalCost = 0;
        for(Edge e : edges) {
            int rootU = find(e.u, parent);
            int rootV = find(e.v, parent);
            if (rootU != rootV) {
                parent[rootU] = rootV;
                totalCost += e.w;
            }
        }
        System.out.println(totalCost);
    }

    public static int find(int x, int[] parent) {
        if (parent[x] != x) {
            parent[x] = find(parent[x], parent);
        }
        return parent[x];
    }
}