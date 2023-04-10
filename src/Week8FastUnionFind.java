import java.util.*;

public class Week8FastUnionFind {
    private final int[] parent;
    private final int[] rank;

    public Week8FastUnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    private int find(int x) {
        int root = x;
        while (parent[root] != root) {
            int parentOfRoot = parent[root];
            int grandparentOfRoot = parent[parentOfRoot];
            parent[root] = grandparentOfRoot;
            root = grandparentOfRoot;
        }
        return root;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootX] = rootY;
        } else {
            parent[rootY] = rootX;
            if (rank[rootX] == rank[rootY]) {
                rank[rootX]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Week8FastUnionFind uf = new Week8FastUnionFind(n);

        for(int i = 0; i < m; i++) {
            String operation = scanner.next();
            int x = scanner.nextInt();

            if(operation.equals("F")) {
                System.out.println(uf.find(x));
            } else {
                int y = scanner.nextInt();
                uf.union(x, y);
            }
        }
    }
}