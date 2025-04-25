package leetCodeInterviewPrep.Algoritmos.Done;
import java.util.*;

class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    // Constructor
    @SuppressWarnings("unchecked")
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); // For undirected graph
    }

    // Perform BFS traversal from a given start node
    public void bfs(int startNode) {
        boolean[] visited = new boolean[vertices]; // Track visited nodes
        Queue<Integer> queue = new LinkedList<>(); // Queue for BFS

        visited[startNode] = true;
        queue.add(startNode);

        System.out.println("BFS Traversal starting from node " + startNode + ":");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6); // Create a graph with 6 nodes
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        graph.bfs(0); // Perform BFS from node 0
    }
}
