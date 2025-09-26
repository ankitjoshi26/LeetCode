// https://leetcode.com/problems/intersection-of-two-arrays-ii/

package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode_Q350 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }   
    static int[] intersect(int[] nums1, int[] nums2) {
      int[] freqArr = new int[1001];
      //calculate frequency of num1;
      for(int num : nums1){
        freqArr[num]++;
      }     

      ArrayList<Integer> list = new ArrayList<>();
      for(int num : nums2){
        if(freqArr[num]>0){
            list.add(num);
            freqArr[num]--;
        }
      }

      int k = list.size();
      int res[] = new int[k];
      for(int i=0;i<k;i++){
        res[i] = list.get(i);
      }
      return res;
    } 
}
