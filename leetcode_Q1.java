// https://leetcode.com/problems/two-sum

package LeetCode;

import java.util.Arrays;

public class leetcode_Q1 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {3,2,4};
        int target = 6;
        int ans[] = find(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (nums[i]+nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

}
