import java.util.*;

public class creatingGraph {
    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
            
        }
    }
    public static void main(String[] args) {
        /*
        
                    (5)
                0 ---------- 1
                           /  \
                     (1)  /    \ (3)
                         /      \
                        2 ------ 3
                        |   (1)
                     (2)|
                        |
                        4
         */

         int v = 5;
         // int arr[] = new arr[v]
         ArrayList<Edge>[] graph = new ArrayList[v];// null --> empty arraylist 
         for(int i = 0; i<v; i++){
            graph[i] = new ArrayList<>(); // for storing edges
         }

         // 0 vertics
         graph[0].add(new Edge(0, 1, 5));

         // 1 vertics
         graph[1].add(new Edge(1, 0, 5));
         graph[1].add(new Edge(1, 2, 1));
         graph[1].add(new Edge(1, 3, 3));

         // 2 vertics
         graph[2].add(new Edge(2, 1, 1));
         graph[2].add(new Edge(2, 3, 1));
         graph[2].add(new Edge(2, 4, 2));

         // 3 vertics
         graph[3].add(new Edge(3, 1, 3));
         graph[3].add(new Edge(3, 2, 1));

         // 4 vertics
         graph[4].add(new Edge(4, 2, 2));

         // 2's neighbours
         for(int i = 0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i); // src, dest, wt
            System.out.println(e.dest);
         }
 
    }
}
