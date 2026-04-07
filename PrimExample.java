import java.util.*;

class Pair {
    int vertex, weight;

    Pair(int v, int w) {
        vertex = v;
        weight = w;
    }
}

public class PrimExample {

    public static void prims(int V, List<List<Pair>> adj) {

        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> a.weight - b.weight);

        // Start from vertex 0
        pq.add(new Pair(0, 0));

        int totalWeight = 0;

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.vertex;

            if (visited[u])
                continue;

            visited[u] = true;
            totalWeight += current.weight;

            System.out.println("Include vertex: " + u +
                               " with weight: " + current.weight);

            for (Pair neighbor : adj.get(u)) {
                if (!visited[neighbor.vertex]) {
                    pq.add(new Pair(neighbor.vertex, neighbor.weight));
                }
            }
        }

        System.out.println("Total MST Weight: " + totalWeight);
    }

    public static void main(String[] args) {
        int V = 4;

        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // Undirected graph
        adj.get(0).add(new Pair(1, 2));
        adj.get(1).add(new Pair(0, 2));

        adj.get(0).add(new Pair(2, 6));
        adj.get(2).add(new Pair(0, 6));

        adj.get(0).add(new Pair(3, 3));
        adj.get(3).add(new Pair(0, 3));

        adj.get(1).add(new Pair(3, 8));
        adj.get(3).add(new Pair(1, 8));

        adj.get(2).add(new Pair(3, 7));
        adj.get(3).add(new Pair(2, 7));

        prims(V, adj);
    }
}
