package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

import BinarySearch.infiniteArrays;

public class leetcode_Q349 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int n2 : nums2){
            set.add(n2);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int n1 : nums1){
            if(set.contains(n1)){
                list.add(n1);
                set.remove(n1);   
            }
        }

        //converting to array
        int res[] = new int[list.size()];
        for(int i=0; i<list.size();i++){
            res[i] = list.get(i); 
        }
        return res;
    }
}
