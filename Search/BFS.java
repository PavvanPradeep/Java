package Java.Search;
import java.util.*;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;
    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; ++i) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    public void bfsTraversal(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class BFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices");
        int numVertices = scanner.nextInt();
        Graph graph = new Graph(numVertices);

        System.out.print("Enter the number of edges");
        int numEdges = scanner.nextInt();
        System.out.println("Enter the edges (format: source destination):");
        for (int i = 0; i < numEdges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        System.out.print("Enter the starting vertex for BFS");
        int startVertex = scanner.nextInt();

        System.out.println("BFS Traversal starting from vertex " + startVertex + ":");
        graph.bfsTraversal(startVertex);

        scanner.close();
    }
}
