// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

package LeetCode;

public class leetcode_Q81 {
    public static void main(String[] args) {
         System.out.println();
        int[] arr = {1,1,1,1,1,1,1,2,1,1,1,1,1};
        System.out.println(search(arr, 2));
    }
    static boolean search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) return true;

            // Cannot decide which part is sorted due to duplicates
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }
            // Left half is sorted
            else if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false; // target not found
    }
}
