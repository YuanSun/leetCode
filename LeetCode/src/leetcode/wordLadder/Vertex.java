package leetcode.wordLadder;

import java.util.ArrayList;

public class Vertex implements Comparable<Vertex>{
    public final String word;
    public ArrayList<Edge> adjacencies;
    public Double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous; // used for store path
    
    public Vertex(String word) {
        this.word = word;
    }
    
    public String getWord() {
        return this.word;
    }
    
    public int compareTo(Vertex other) {
        return Double.compare(minDistance, other.minDistance);
    }
    
    public void displayAdjacencies() {
        System.out.printf("%s", word);
        for(Edge e: adjacencies)
            e.displayEdge();
    }
}
