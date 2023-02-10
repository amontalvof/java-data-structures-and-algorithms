package montalvo.dsa.dataStructures.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
    private Map<T, List<T>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(T vertex) {
        List<T> list = new ArrayList<>();
        if (this.getAdjacencyList().get(vertex) == null) {
            this.adjacencyList.put(vertex, list);
        }
    }

    public void removeVertex(T vertex) {
        if (this.getAdjacencyList().get(vertex) != null) {
            this.getAdjacencyList().remove(vertex);
            for (T key : this.getAdjacencyList().keySet()) {
                this.getAdjacencyList().get(key).remove(vertex);
            }
        }
    }

    public void addEdge(T vertex1, T vertex2) {
        if (this.getAdjacencyList().get(vertex1) != null && this.getAdjacencyList().get(vertex2) != null) {
            this.getAdjacencyList().get(vertex1).add(vertex2);
            this.getAdjacencyList().get(vertex2).add(vertex1);
        }
    }

    public void removeEdge(T vertex1, T vertex2) {
        if (this.getAdjacencyList().get(vertex1) != null && this.getAdjacencyList().get(vertex2) != null) {
            this.getAdjacencyList().get(vertex1).remove(vertex2);
            this.getAdjacencyList().get(vertex2).remove(vertex1);
        }
    }

    public Map<T, List<T>> getAdjacencyList() {
        return this.adjacencyList;
    }

}
