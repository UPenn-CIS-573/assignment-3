import java.util.List;

import edu.upenn.cis573.graphs.*;

public class ReliablePathFinder extends PathFinder {

    public ReliablePathFinder(Graph g) {
        super(g);
    }

    /*
     * Implement this method using a Recovery Block and Retry Block as described in
     * the assignment specification.
     */
    public List<Integer> findPath(int src, int dest) throws PathNotFoundException {

        throw new PathNotFoundException();

    }

    /*
     * Implement this acceptance test as described in the assignment specification.
     */
    public boolean isValidPath(int src, int dest, List<Integer> path) {

        return false;

    }

}
