package DAA;
import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }

    // Sort edges by weight
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

class MST {

    static int[] parent;

    // Find with path compression
    static int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    // Union
    static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        parent[rootX] = rootY;
    }

    public static void kruskal(int V, List<Edge> edges) {
        Collections.sort(edges); // Step 1

        parent = new int[V];
        for (int i = 0; i < V; i++)
            parent[i] = i;

        int edgeCount = 0;

        System.out.println("Edges in MST:");

        for (Edge e : edges) {
            if (find(e.src) != find(e.dest)) {

                System.out.println(e.src + " - " + e.dest + " : " + e.weight);

                union(e.src, e.dest);
                edgeCount++;

                if (edgeCount == V - 1)
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        kruskal(V, edges);
    }
}