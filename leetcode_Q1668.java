package LeetCode;

public class leetcode_Q1668 {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        System.out.println(maxRepeatingSubstring(sequence,word));
    }
    static int maxRepeatingSubstring(String str, String word){
    int count=0;
    String temp=word;
    while(str.contains(temp)){
        count++;
        temp+=word;
      }
      return count;
    }
}
