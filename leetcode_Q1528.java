// https://leetcode.com/problems/shuffle-string/description/

package LeetCode;

public class leetcode_Q1528 {
    public static void main(String[] args) {
        String str = "bca";
        int[] arr = {1,2,0};
        System.out.println(restoreString(str, arr));
    }
    static String restoreString(String str, int[] indices){
        char[] newChar = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            newChar[indices[i]] = str.charAt(i);
        }
        String s1 = new String(newChar);
        return s1;
    }
}
