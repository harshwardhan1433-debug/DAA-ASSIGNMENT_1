public class q1_AdjacencyMatrix {

    int vertices;
    int matrix[][];


    q1_AdjacencyMatrix(int v) {

        vertices = v;
        matrix = new int[v][v];
    }


    void addEdge(int source, int destination) {

        matrix[source][destination] = 1;
        matrix[destination][source] = 1; // For undirected graph
    }

    
    void printMatrix() {

        System.out.println("Adjacency Matrix Representation:\n");

        for(int i = 0; i < vertices; i++) {

            for(int j = 0; j < vertices; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    
    public static void main(String[] args) {

        q1_AdjacencyMatrix graph = new q1_AdjacencyMatrix(4);


        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);


        graph.printMatrix();
    }
}
