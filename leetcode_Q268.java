package LeetCode;

import java.util.Arrays;

public class leetcode_Q268 {
    public static void main(String[] args) {
        int[] arr = {1,0,3};
        System.out.println(missingNumber(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //for searching
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
             return index;
            }
        }
        //case 2 => if all number are in place.
        return nums.length;
    }
}