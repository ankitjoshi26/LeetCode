package LeetCode;

public class leetcode_Q28 {
    public static void main(String[] args) {
        String hayStack = "sadbutsad";
        String needle = "sad";
        
        System.out.println(strStr(hayStack,needle));
    }
    static int strStr(String haystack, String needle){
        for(int i=0,j=needle.length();j<=haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
