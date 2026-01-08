// https://leetcode.com/problems/relative-sort-array/
package LeetCode;

import java.util.Arrays;

public class leetcode_Q1122 {
    public static void main(String[] args) {
        int[] arr1 = {2,1,2,3,1,4};
        int[] arr2 = {2,1};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
    static int[] relativeSortArray(int[] arr1, int[] arr2){
        // find length of arr1
        int length = 0;      // store max element from arr1
        for(int i=0;i<arr1.length;i++){
            length = Math.max(length, arr1[i]);
        }

        // find frequency of each element of arr1
        int[] count = new int[length+1]; // bcz it from start from 0 so we will take length+1;
        for(int i=0;i<arr1.length;i++){
            count[arr1[i]]++;
        }

        // store arr2 element in answer array 
        int[] ans = new int[arr1.length];
        int index = 0;
        for(int i=0;i<arr2.length;i++){
            while(count[arr2[i]] > 0){
                ans[index] = arr2[i];
                index++;
                count[arr2[i]]--;
            }
        }

        // store remaining element of count in answer.
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                ans[index] = i;
                index++;
                count[i]--;
            }
        }
        return ans;
    }
}