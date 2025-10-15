// https://leetcode.com/problems/merge-sorted-array/description/

package LeetCode;

import java.util.Arrays;

public class leetcode_Q88 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;   //length of num1 element...
        int j = n - 1;   //length of num2 element...
        int k = (m + n) - 1;   //length of full array where both arrey will be merged (length of arr1)..

        while (j>=0) {
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}