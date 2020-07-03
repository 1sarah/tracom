package graphs;

public class TestGraph {
    public static void main(String[] args) {
        GraphWeighted graph = new GraphWeighted(true);

        // Create nodes
        NodeWeighted zero = new NodeWeighted(0, "0");
        NodeWeighted one = new NodeWeighted(1, "1");
        NodeWeighted two = new NodeWeighted(2, "2");
        NodeWeighted three = new NodeWeighted(3, "3");
        NodeWeighted four = new NodeWeighted(4, "4");
        NodeWeighted five = new NodeWeighted(5, "5");
        NodeWeighted six = new NodeWeighted(6, "6");

        // adds Nodes
        graph.addEdge(zero, one, 8);
        graph.addEdge(zero, two, 11);
        graph.addEdge(one, three, 3);
        graph.addEdge(one, four, 8);
        graph.addEdge(one, two, 7);
        graph.addEdge(two, four, 9);
        graph.addEdge(three, four, 5);
        graph.addEdge(three, five, 2);
        graph.addEdge(four, six, 6);
        graph.addEdge(five, four, 1);
        graph.addEdge(five, six, 8);

        graph.shortestPath(two, six);
    }
}