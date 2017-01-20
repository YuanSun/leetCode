package wordLadder;

import java.util.HashSet;

/**
 *
 * @author ysun
 */
public class WordLadderMain {
    public static void main(String[] args) {
        Vertex beginWord = new Vertex("hit");
        Vertex endWord = new Vertex("cog");
        HashSet<Vertex> wordDict = new HashSet<>();
        
        wordDict.add(new Vertex("hot"));
        wordDict.add(new Vertex("dot"));
        wordDict.add(new Vertex("dog"));
        wordDict.add(new Vertex("lot"));
        wordDict.add(new Vertex("log"));
        
        FindMinPath.constructPath(beginWord, endWord, wordDict);
    }
}
