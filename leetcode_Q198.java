package LeetCode;

public class leetcode_Q198 {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        System.out.println();
        System.out.println(rob(arr));
    }
    static int rob(int[] nums){
        int sum = 0;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            sum += nums[start];
            start += 2;
        }
        return sum;
    }
}
