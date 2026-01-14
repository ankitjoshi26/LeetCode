// https://leetcode.com/problems/reverse-prefix-of-word/description/
package LeetCode;

public class leetcode_Q1768 {
    public static void main(String[] args) {
        String word1 = "abcde";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
    static String mergeAlternately(String word1, String word2){
        StringBuilder merged = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if(i < word1.length()){
                merged.append(word1.charAt(i));
            }
            if(i < word2.length()){
                merged.append(word2.charAt(i));
            }
            i++;
        }
        return merged.toString();
    }
}
