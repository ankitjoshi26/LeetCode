// https://leetcode.com/problems/height-checker/description/
package LeetCode;

import java.util.Arrays;

public class leetcode_Q1051 {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,3};
        System.out.println(hightChecker(heights));  
    }
    static int hightChecker(int[] heights){
        int[] expected = heights.clone();   // clone(): create copy on an object
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}