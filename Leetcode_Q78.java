package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_Q78 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), ans);
        System.out.println(ans);
    }
    static private void helper(int index, int[] nums,
                        List<Integer> current,
                        List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(nums[index]);
        helper(index + 1, nums, current, ans);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude the current element
        helper(index + 1, nums, current, ans);
    }
}