package LeetCode;

public class leetcode_Q287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i<nums.length) {
            if(nums[i] != i+1){       // agar value apni index jagah pe nhi hai to...
                int correct = nums[i] - 1;     // value ki correct jagah
               if(nums[i] != nums[correct]){   // agar [correct] index pe shi value nhi hai to wha pe shi value daal do...
                  swap(nums,i,correct);  // calling swap function...
               }else{    // or agar [correct] index pe shi duplicate value phle se hai to wo answer hai...
                  return nums[i];
            }
            }
            else{   // agar value apni correct index pe hai to i++ krdo...
                i++;
            }    
        }
        return -1;
    } 
}