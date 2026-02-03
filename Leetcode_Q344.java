package LeetCode;

public class Leetcode_Q344 {
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        reverseString(str);
        System.out.println(str);
    }
    public static void reverseString(char[] s){
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
