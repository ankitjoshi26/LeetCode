package LeetCode;

import java.util.Arrays;

public class leetcode_Q1365 {
    public static void main(String[] args) {
        int[] arr = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] < nums[i] && j != i){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}