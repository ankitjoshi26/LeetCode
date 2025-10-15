package LeetCode;

import Array.swapElem;

public class leetcode_Q41 {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]  - 1;
            if(nums[i] > 0 && nums[i] <=nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //for searching
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
             return index + 1;
            }
        }
        //case 2 => if all number are in place.
        return nums.length + 1;
    }
}