package LeetCode;

public class leetcode_Q1342 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(count(num));
    }
    static int count(int num){
        return helper(num , 0);
    }
    private static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            return helper(num / 2, count + 1);
        }
        return helper(num - 1, count + 1);
    }
}
