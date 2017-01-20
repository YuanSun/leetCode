package leetcode.wordLadder;

import java.util.ArrayList;

public class Vertex implements Comparable<Vertex>{
    public final String word;
    public ArrayList<Edge> adjacencies;
    public Double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous; // used for store path
    
    public Vertex(String word) {
        this.adjacencies = new ArrayList<>();
        this.word = word;
    }
    
    public String getWord() {
        return this.word;
    }
    
    @Override
    public int compareTo(Vertex other) {
        return Double.compare(minDistance, other.minDistance);
    }
    
    public void displayAdjacencies() {
        System.out.printf("%s", word);
        adjacencies.forEach((e) -> {
            e.displayEdge();
        });
    }
}
