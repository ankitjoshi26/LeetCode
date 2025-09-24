// https://leetcode.com/problems/search-insert-position/

package LeetCode;

public class leetcode_Q35 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println();
        System.out.println(searchInsertPosition(arr,2));
    }

    static int searchInsertPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end + 1;
    }
}
