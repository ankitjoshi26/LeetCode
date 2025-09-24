// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

package LeetCode;

public class leetcode_Q852 {
    public static void main(String[] args) {
        int[] arr = {0,2,3,1,0};
        System.out.println();
        System.out.println(peakElement(arr));
    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;      
    }
}