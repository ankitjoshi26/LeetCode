package LeetCode;

public class leetcode_Q14 {
    public static void main(String[] args) {
        String[] str = {"flower","flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }
    static String longestCommonPrefix(String[] strs){
        String prefix = strs[0]; 
        int prefixLength = prefix.length();

        for(int i=1;i<strs.length;i++){
            String s = strs[i];  

            while (prefixLength > s.length() || ! prefix.equals(s.substring(0,prefixLength))) {

                prefixLength --;   // decrese length of prefix.
                if(prefixLength == 0){
                    return "";
                }
                prefix = prefix.substring(0,prefixLength); // store updated value of prefix.
            }
        }
        return prefix;
    }
}