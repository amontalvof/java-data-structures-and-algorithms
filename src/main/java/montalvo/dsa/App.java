package montalvo.dsa;

import montalvo.dsa.dataStructures.graphs.Graph;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Graph<String> graph = new Graph<>();
        graph.addVertex("Tokyo");
        graph.addVertex("Dallas");
        graph.addVertex("Aspen");
        graph.addVertex("Los Angeles");
        graph.addVertex("Hong Kong");
        graph.addEdge("Dallas", "Tokyo");
        graph.addEdge("Dallas", "Aspen");
        graph.addEdge("Hong Kong", "Tokyo");
        graph.addEdge("Hong Kong", "Dallas");
        graph.addEdge("Los Angeles", "Hong Kong");
        graph.addEdge("Los Angeles", "Dallas");
        graph.removeVertex("Hong Kong");
        graph.removeVertex("Aspen");
        System.out.println("[46m************************************[0m");
    }

}
