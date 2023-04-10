import java.util.*;

public class Week8FastUnion {
    private final int[] parent;
    private final int[] rank;

    public Week8FastUnion(int n) {
        parent = new int[n];
        rank = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    private int find(int x) {
        if(parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                if (rank[rootX] == rank[rootY]) {
                    rank[rootX]++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Week8FastUnion uf = new Week8FastUnion(n);

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