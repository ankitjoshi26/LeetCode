package LeetCode;

import Array.max;
import Recursion.String.removeCh;

public class Leetcode_Q1464 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }

    // brute force
    public static int maxProduct(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                int product = (arr[i]-1) * (arr[j] - 1);
                if(max < product){
                    max = product;
                }
            }
        }
        return max;
    }

    // optimized

    public static int maxProductOptimized(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max1){
                max2 = max1;
                max1 = num;
            }else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}