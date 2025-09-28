// https://leetcode.com/problems/single-element-in-a-sorted-array/

package LeetCode;

public class leetcode_Q540 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4,7,7};
        System.out.println();
        System.out.println(singleNonDuplicate(arr));
    }
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;

            if(mid % 2 == 1){
                mid--;
            }

            if(nums[mid] != nums[mid + 1]){
                end = mid;
            }else{
                start = mid + 2;
            }
        }
        return nums[start];
    }
}
