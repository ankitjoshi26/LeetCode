// https://leetcode.com/problems/product-of-array-except-self/description/

package LeetCode;

import java.util.Arrays;

public class leetcode_Q238 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        //prefix
        answer[0] = 1;
        for(int i=1;i<nums.length;i++){
            answer[i] = answer[i-1] * nums[i-1];
        }
        int suffix = 1;
        for(int j=nums.length-1;j>=0;j--){
            answer[j] = answer[j] * suffix;
            suffix = suffix * nums[j];
        }
        return answer;
    }
}
