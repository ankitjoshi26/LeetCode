// https://leetcode.com/problems/two-sum

package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Leetcode_Q1 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {2,7,11,15};
        int target = 9;
        int ans[] = find(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[] nums,int target){

        // method 1 : for indices

        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if (nums[i]+nums[j] == target) {
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {-1,-1};

        // method 2: for value

        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     int currAns = target - nums[i];
        //     if(set.contains(currAns)){
        //         return new int[] {nums[i],currAns};
        //     }
        //     else{
        //         set.add(nums[i]);
        //     }
        // }
        // return new int[] {-1,-1};

        // method 3 : for indices using HashMap

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currans = target - nums[i];
            if(map.containsKey(currans)){
                return new int[] {map.get(currans), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[] {-1,-1};
    }

}
