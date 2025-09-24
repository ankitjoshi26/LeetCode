// https://leetcode.com/problems/kth-missing-positive-number/

package LeetCode;

public class leetcode_Q1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println();
        System.out.println(missingNum(arr,5));
    }
    static int missingNum(int[] nums, int k){

        // brute force 


        // int num = 1;
        // int n = nums.length;
        // int i = 0;

        // while(i<n && k>0){
        //     if(nums[i] == num){
        //         i++;
        //     }else{
        //         k--;
        //     }

        //     num++;
        // }

        // while(k>0){
        //     num++;
        //     k--;
        // }

        // return num-1;

        // binary search =>

        int n = nums.length;
        int start = 0;
        int end = n-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            int missingNums = nums[mid] - (mid + 1);

            if(missingNums < k){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return start + k;
    }
}
