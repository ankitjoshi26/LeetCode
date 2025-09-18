// https://leetcode.com/problems/rotate-array/description/

package LeetCode;

import java.util.Arrays;

public class leetcode_Q189 {
    public static void main(String[] args) {
        int[] arr = {1,7,9,11};
        int k = 2;
        System.out.println(Arrays.toString(rotate(arr,k)));
    }
    static int[] rotate(int[] nums, int k){
        int[] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[(i+k)%nums.length] = nums[i];
        }
        return temp;
    }
}
