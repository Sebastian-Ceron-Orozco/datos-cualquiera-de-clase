import java.util.LinkedList;

class Graph{
    int v;
    LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[v] = new LinkedList<Integer>();
        }
    }
    void añadirArista(int u,int v){
        adj[u].add(v);
    }


public static void main(String[] args) throws Exception {
    Graph grafo = new Graph(4);
    grafo.añadirArista(0,1);
    grafo.añadirArista(0,2);

}
}