package LeetCode;

import java.util.Arrays;

public class Leetcode_Q16 {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(theeSumCloset(arr, target));
    }
    static int theeSumCloset(int[] arr, int target){
        int ans = 0;
        int diff = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                int sum = arr[i] + arr[left] + arr[right];
                int currDiff = Math.abs(target - sum);

                if(currDiff < diff){
                    diff = currDiff;
                    ans = sum;
                }

                if(sum == target){
                    return target;
                }else if(ans > target){
                    right --;
                }else{
                    left ++;
                }
            }
        }
    return ans;
    }   
}