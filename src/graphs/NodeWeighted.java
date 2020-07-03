package graphs;

import java.util.LinkedList;

public class NodeWeighted {
    // The int id and String name are just arbitrary attributes
    // we've chosen for our nodes. Can be whatever you need
    int id;
    String name;
    private boolean visited;
    LinkedList<EdgeWeighted> edges;

    NodeWeighted(int id, String name) {
        this.id = id;
        this.name = name;
        visited = false;
        edges = new LinkedList<>();
    }

    boolean isVisited () {
        return visited;
    }

    void visit () {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }

}
