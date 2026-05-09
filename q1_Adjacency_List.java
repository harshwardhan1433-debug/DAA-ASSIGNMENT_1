import java.util.*;

public class q1_Adjacency_List {

    int vertices;
    ArrayList<ArrayList<Integer>> list;


    q1_Adjacency_List(int v) {

        vertices = v;

        list = new ArrayList<>();

        for(int i = 0; i < v; i++) {

            list.add(new ArrayList<>());
        }
    }


    void addEdge(int source, int destination) {

        list.get(source).add(destination);
        list.get(destination).add(source); // For undirected graph
    }


    void printList() {

        System.out.println("Adjacency List Representation:\n");

        for(int i = 0; i < vertices; i++) {

            System.out.print(i + " -> ");

            for(int node : list.get(i)) {

                System.out.print(node + " ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {

        q1_Adjacency_List graph = new q1_Adjacency_List(4);


        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);

        
        graph.printList();
    }
}