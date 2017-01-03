package leetcode.wordLadder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class FindMinPath {
    public static void constructPath(Vertex beginWord, Vertex endWord, HashSet<Vertex> wordDict) {
        HashMap<String, Vertex> Vertice = new HashMap<>();
        wordDict.add(beginWord);
        wordDict.add(endWord);
        
        wordDict.forEach((word) -> {
            Vertice.put(word.getWord(), word);
        });
        String[] wordDictArr;
        wordDictArr = wordDict.stream()
                .map(Vertex::getWord)
                .toArray(String[]::new);

        // contruct adjacency according to one char difference relation
        for (int i = 0; i < wordDictArr.length - 1; i++) {
            for (int j = i + 1; j < wordDictArr.length; j++) {
                if(isNeighbor(wordDictArr[i], wordDictArr[j])) {
                    System.out.println("i is " + i + ", j is " + j);
                    System.out.println("Word[i] is " + wordDictArr[i] + ", word[j] is " + wordDictArr[j]);
                    Vertice.get(wordDictArr[i]).adjacencies.add(new Edge(Vertice.get(wordDictArr[j])));
                    Vertice.get(wordDictArr[j]).adjacencies.add(new Edge(Vertice.get(wordDictArr[i])));
                }
            }
        }
        
        HashMap<Double, ArrayList<Vertex>> transformSteps = findMinPath(beginWord, endWord);
        if(transformSteps == null)
            System.out.println("No possible transfermation fould!!!");
        else {
            transformSteps.keySet().forEach(key -> {
                System.out.println("It takes " + key + " steps to transform from " + beginWord + " to " + endWord + ".");
                System.out.print("The path is:");
                transformSteps.get(key).forEach((u) -> {
                    System.out.print(u.getWord() + " ");
                });
                System.out.println("");
            });
        }
        
        
    }
    
    private static HashMap<Double, ArrayList<Vertex>> findMinPath(Vertex beginWord, Vertex endWord) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(beginWord);
        
        // BFS
        while(!queue.isEmpty()) {
            Vertex checkWord = queue.poll();
            
            // visit each edge of checkword
            checkWord.adjacencies.stream().map((e) -> e.getTarget()).forEachOrdered((target) -> {
                Double distanceThroughTarget = checkWord.minDistance + 1.0; // every edge has weight of 1
                // update min distance to the target and keep the path
                if (distanceThroughTarget < target.minDistance) {
                    queue.remove(target); // check ifi necessary
                    
                    target.minDistance = distanceThroughTarget;
                    target.previous = checkWord;
                    queue.add(target);
                }
            });
        }
        
        ArrayList<Vertex> path = new ArrayList<>();
        if(endWord.previous == null)
            return null;
        
        Vertex wordPath = endWord;
        Double minSteps = endWord.minDistance;
        while(wordPath.previous != null) {
            path.add(wordPath);
            wordPath = wordPath.previous;
        }
        
        Collections.reverse(path);
        HashMap<Double, ArrayList<Vertex>> shortestPath = new HashMap<>();
        shortestPath.put(minSteps, path);
        return shortestPath;
    }

    /**
     * 
     * @param source
     * @param target
     * @return true if source and target are adjacent according to one char difference relation
     */
    private static boolean isNeighbor(String source, String target) {
       assert source.length() == target.length();
        int diff = 0; // check if source and target is one char different
        for (int i = 0; i < source.length(); i++) {
           if (source.charAt(i) != target.charAt(i))
               diff++;
           if(diff > 1)
               return false;
        }
        return true;
    }
}
