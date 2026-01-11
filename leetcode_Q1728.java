package LeetCode;

public class leetcode_Q1728 {
    public static void main(String[] args) {
        String str = "10100";
        System.out.println(checkOnesSegment(str));
    }
    static boolean checkOnesSegment(String str){
       return !str.contains("01");
    }
}