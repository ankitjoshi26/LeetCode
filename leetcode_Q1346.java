// https://leetcode.com/problems/check-if-n-and-its-double-exist/

package LeetCode;

import java.util.HashSet;

public class leetcode_Q1346 {
    public static void main(String[] args) {
         int[] arr = {10,2,5,3};
         System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int element : arr){
            if(set.contains(element*2) || (element%2==0) && (set.contains(element/2))){
                return true;
            }
            set.add(element);
        }
        return false;
    }
}
