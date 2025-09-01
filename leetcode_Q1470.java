// https://leetcode.com/problems/shuffle-the-array/

package LeetCode;

import java.util.Arrays;

public class leetcode_Q1470 {
    public static void main(String[] args) {
        System.out.println();
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(suffleTheArray(nums,3)));
    }
    static int[] suffleTheArray(int[] nums, int n){
        int[] arr = new int[2*n];
        int count = 0;

        for(int i=0; i < n; i++){
            arr[count] = nums[i];
            arr[count + 1] = nums[i + n];
            count += 2;
        }
        return arr;
    }
}
