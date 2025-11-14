package LeetCode;

public class leetcode_Q1967 {
    public static void main(String[] args) {
        String[] patterns = {"a","b","abc","d"};
        String word = "abc";

        System.out.println(numOfString(patterns,word));
    }
    static int numOfString(String[] patterns, String word){
        int count = 0;
        for(String elem : patterns){
            if(word.contains(elem)){
                count++;
            }
        }
        return count;
    }
}
