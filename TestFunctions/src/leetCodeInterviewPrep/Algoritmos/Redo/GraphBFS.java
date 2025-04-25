package leetCodeInterviewPrep.Algoritmos.Redo;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

    private int vertices; // Number of vertices
    private LinkedList<Integer>[] adjList; //Adjency List

    //Constructor
    @SuppressWarnings("unchecked")
    public GraphBFS(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for(int i=0; i<vertices; i++){
            adjList[i] = new LinkedList<Integer>();
        }

    }

    public void addEdge(int src, int dst) {
        adjList[src].add(dst);
        adjList[dst].add(src);
    }


    public void bfs(int startNode){
        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>(); //Queue for BFS


        visited[startNode]= true;

        queue.add(startNode);
        System.out.println("BFS Traversal starting from node " + startNode + ":");


        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println( node + " ");

            for(int neighbor : adjList[node]){

                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS(6); // Create a graph with 6 nodes
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        graph.bfs(0); // Perform BFS from node 0
    }
}
