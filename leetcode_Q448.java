// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_Q448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static void swap(int[] arr, int first, int second){   //work for method 1 only...
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static List<Integer> findDisappearedNumbers(int[] nums){    
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }


    //     for(int i=0;i<nums.length;i++){                   //method 2
    //         int index = Math.abs(nums[i]) - 1;
    //         if(nums[index] > 0){
    //             nums[index] = -nums[index];
    //         }
    //     }

        for(int index=0;index < nums.length;index++){      //work for both the methods...
            // if(nums[index]>0){             //for method 2
            //     result.add(index+1);
            // }

            int correct = index + 1;      //for method 1
            if(nums[index] != correct){    
                result.add(correct);
            }
        }
        return result;
    }
}