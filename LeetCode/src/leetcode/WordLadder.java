package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author ysun
 */
public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        Queue<String> queue = new LinkedList<>();
        int transformSteps = 0;
        queue.add(beginWord);
        
        while(!queue.isEmpty()) {
            String checkWord = queue.remove();
            if(checkWord.equals(endWord))
                return transformSteps;
            
            char[] wordArr = checkWord.toCharArray();
            for(int i = 0; i < wordArr.length; i++) {
                for(char c = 'a'; c <= 'z'; c++) {
                    char temp = wordArr[i];
                    if(wordArr[i] != c)
                        wordArr[i] = c;
                    
                    String newWord = new String(wordArr);
                    if(wordDict.contains(newWord)) {
                        queue.add(newWord);
                        transformSteps++;
                    }
                    
                    wordArr[i] = temp;
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        Set<String> wordDict = new HashSet<>();
        String[] wordDictString = {"hot", "dot", "dog", "lot", "log"};
        for(String word : wordDictString)
            wordDict.add(word);
        
        int transformSteps = ladderLength(beginWord, endWord, wordDict);
        System.out.println("It takes " + transformSteps + " steps to transform from " + beginWord + " to " + endWord);
    }
    
}
