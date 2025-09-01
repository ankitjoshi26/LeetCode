// https://leetcode.com/problems/concatenation-of-array/

package LeetCode;

import java.util.Arrays;
public class leetcode_Q1929 {
    public static void main(String[] args) {
           int arr[] = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        for(int i=0;i<arr.length;i++){
            arr[i] = nums[i%n];
        }
        return arr;
    }   
}
