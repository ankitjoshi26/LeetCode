// https://leetcode.com/problems/running-sum-of-1d-array/

package LeetCode;

import java.util.Arrays;

public class leetcoe_Q1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static int[] runningSum(int[] nums) {
       for(int i=1;i<nums.length;i++){
        nums[i] += nums[i-1];
       }
       return nums;
    }
}