package LeetCode;

import java.util.HashMap;

public class Leetcode_Q219 {
    public static void main(String[] string){
        int[] arr = {1,0,1,1};
        System.out.println(containsDuplicatesII(arr, 1));
    }
    public static boolean containsDuplicatesII(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value = arr[i];
            if(map.containsKey(value) && i - map.get(value) <= k){
                return true;
            }

            map.put(value,i);
        }

        return false;
    }
}