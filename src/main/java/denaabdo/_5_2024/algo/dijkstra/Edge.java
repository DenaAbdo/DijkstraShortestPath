package denaabdo._5_2024.algo.dijkstra;

public class Edge {
    Vertex source, destination;
    double weight;

    public Edge(Vertex source, Vertex destinaiton){
        this.source = source;
        this.destination = destination;
        this.weight = calculateWeight(source, destination);
    }
    public double calculateWeight(Vertex source, Vertex destination){
        //based on Euclidean distance d = square root of( (x2−x1)^2 + (y2-y1)^2)
        double dx = destination.getX() - source.getX();
        double dy = destination.getY() - source.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWight(double wight) {
        this.weight = wight;
    }
}
