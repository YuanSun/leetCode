package wordLadder;


class Edge {
    public final Vertex target;
    
    public Edge(Vertex target) {
        this.target = target;
    }
    
    public Vertex getTarget(){
        return target;
    }
    
    public void displayEdge() {
        System.out.printf(" -> %s", target.getWord());
    }
}
