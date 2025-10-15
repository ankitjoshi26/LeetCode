package LeetCode;

import java.util.Arrays;

public class leetcode_Q217{
    public static void main(String[] args) {
        int[] arr = {1,4,3,3};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int index=1;index<nums.length;index++){
            if(nums[index] == nums[index - 1]){
                return true;
            }
        }
        return false;
    }
}