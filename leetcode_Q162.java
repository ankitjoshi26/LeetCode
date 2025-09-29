package LeetCode;

public class leetcode_Q162 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] nums) {
       int n = nums.length;
       int start = 0, end = n - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid + 1]) {
                // Peak must be on the right side
                start = mid + 1;
            } else {
                // Peak is on the left side or mid itself
                end = mid;
            }
        }
        // start == end, pointing to the peak
        return start;
    }
}