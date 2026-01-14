// https://leetcode.com/problems/reverse-prefix-of-word/
package LeetCode;

public class leetcode_Q2000 {
    public static void main(String[] args) {
        String str = "abcdefg";
        char ch = 'd';
        System.out.println(reversePrefix(str, ch));
    }
    static String reversePrefix(String word, char ch){
        int i = word.indexOf(ch);
        while (i != -1) {
            return new StringBuilder(word.substring(0,i+1)).reverse().toString() + word.substring(i+1);
        }
        return word;
    }
}
