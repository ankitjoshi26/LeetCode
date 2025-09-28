// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

package LeetCode;

public class leetcode_Q153 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {11,13,14,15};
        System.out.println(search(arr));
    }
    static int search (int[] nums){
    int pivot = findPivot(nums);

    return nums[pivot+1%nums.length];
    }
    static int findPivot(int[] arr){     
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid =  start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        } 
        return -1;
    }   
}