package LeetCode;

public class leetcode_Q58 {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(lengthOfLastWord(str));
    }
    static int lengthOfLastWord(String str){
        String[] arr = str.split("\\s+");
        int length = arr.length-1;
        return arr[length].length();
    }
}
