import java.util.*;
public class q3_topological_sort_DFS {
    
        private int vertices;
        private LinkedList<Integer>[] adj;


        q3_topological_sort_DFS(int v) {
            vertices = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }


        void addEdge(int u, int v) {
            adj[u].add(v);
        }


        void dfs(int v, boolean[] visited, Stack<Integer> stack) {
            visited[v] = true;
            for (int neighbor : adj[v]) {
                if (!visited[neighbor]) {
                    dfs(neighbor, visited, stack);
                }
            }
            stack.push(v);
        }

        // Topological Sort function
        void topologicalSort(char[] labels) {
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[vertices];

            for (int i = 0; i < vertices; i++) {
                if (!visited[i]) {
                    dfs(i, visited, stack);
                }
            }

            System.out.println("Topological Sort : ");
            while (!stack.isEmpty()) {
                System.out.print(labels[stack.pop()] + " ");
            }
        }

        public static void main(String[] args) {

            q3_topological_sort_DFS g = new q3_topological_sort_DFS(14);


            char[] labels = {'m', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'o'};

            // Edges from the assignment graph image:
            g.addEdge(0, 3);  // m -> q
            g.addEdge(0, 4);  // m -> r
            g.addEdge(0, 10); // m -> x
            g.addEdge(1, 3);  // n -> q
            g.addEdge(1, 7);  // n -> u
            g.addEdge(1, 13); // n -> o
            g.addEdge(2, 13); // p -> o
            g.addEdge(2, 5);  // p -> s
            g.addEdge(2, 12); // p -> z
            g.addEdge(13, 4); // o -> r
            g.addEdge(13, 8); // o -> v
            g.addEdge(13, 5); // o -> s
            g.addEdge(5, 4);  // s -> r
            g.addEdge(4, 7);  // r -> u
            g.addEdge(4, 11); // r -> y
            g.addEdge(7, 6);  // u -> t
            g.addEdge(11, 8); // y -> v
            g.addEdge(8, 10); // v -> x
            g.addEdge(8, 9);  // v -> w
            g.addEdge(3, 6);  // q -> t

            g.topologicalSort(labels);
        }
    }

