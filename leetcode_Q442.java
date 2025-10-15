// https://leetcode.com/problems/find-all-duplicates-in-an-array/

package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class leetcode_Q442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i<nums.length) {
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }else{
                    i++;
                }
            }

            //check duplicate

            for(int index=0;index<nums.length;index++){
                if(nums[index] != index + 1){
                    result.add(nums[index]);
                }
            }
        return result;
    }
}