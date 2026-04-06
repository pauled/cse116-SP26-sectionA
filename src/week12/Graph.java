package week12;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph<N> {
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public void addEdge(N from, N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    public void addNode(N node){
        if (!this.adjacencyList.containsKey(node)){
            this.adjacencyList.put(node,new ArrayList<>());
        }
    }
}
