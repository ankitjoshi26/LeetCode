package LeetCode;
import java.util.ArrayList;
import java.util.List;


class Leetcode_Q47 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        permutations(list, new ArrayList<>(), nums, 0);
        
        // System.out.println(list);
    }
    private static void permutations(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> tempList, int[] nums, int idx) {

        if (idx == nums.length) {
            // list.add(new ArrayList<>(tempList));
            System.out.println(tempList);
            return;
        }

        
        int val = nums[idx];

        for (int i = 0; i <= tempList.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<>(tempList);
            temp.add(i, val);

            
            permutations(list, temp, nums, idx + 1);

            while(idx>0 && nums[idx] == nums[idx - 1]){
                return;
            }

        }
    }
}