package LeetCode;

import java.util.Arrays;

public class leetcode_Q34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 8))); 
    }
    static  int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        // int start = search(nums, target, true);
        // int end = search(nums, target, false);

        // ans[0] = start;
        // ans[1] = end;

        //or

        ans[0] = search(nums, target, true);  //If we don't send true → It won’t know it must find the first index.  (for finding first accurance) .. mtlb abhi hame pahali position find krni hai target value ki.


        if(ans [0] != -1){  // agar first index mil gya tbhi last index find kro 
            ans[1] = search(nums, target, false);  // for finding last accurance.... mtlb abhi hame last position find krni hai target value ki
        }
  
        return ans;
    }

    static int search(int[] nums, int target, boolean findfirstindex){
        int ans = -1;  // agar value nhi mili to -1 return hoga...
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;   // mid value

            if(target < nums[mid]){   // agar hamara target chota hai hamari mid value se to end to update kr do
                end = mid - 1;
            }else if(target > nums[mid]){  // agar hamara target bada hai mid value se to start ko update kro
                start = mid + 1;
            }else{  // agar hmara target == mid value ho gya to...
                ans = mid;    // abhi ke liye temporary store krwa do .
                if(findfirstindex){  // index mil to gya hai but hme first accurance chahiye to kya pta abhi mid ke aage value kisi or index pe bhi ho. to first accurance chahiye to mid ke aage ko travel krenge.
                    end = mid - 1;
                }else{
                    start = mid + 1;  // mil to gya but kya pta mid ke baad bhi value kisi index pe or ho to mid ke piche ke baad ke index m bhi check kro
                } 
            }
        }
        return ans;
    }
}