package homework7;

public class Vertex {

    private final String label;

    private boolean visited;

    private Vertex previous;

    public Vertex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "label='" + label + '\'' +
                '}';
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setPrevious(Vertex previous) {
        this.previous = previous;
    }

    public Vertex getPrevious() {
        return previous;
    }
}
