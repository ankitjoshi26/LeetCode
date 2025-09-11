// https://leetcode.com/problems/find-in-mountain-array/

package LeetCode;

public class leetcode_Q1095 {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(answer(arr, 4));
    }
    static int answer(int[] arr, int target){
        int peak = peakElement(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr, target, peak, arr.length - 1);
    }
    static int orderAgnostic(int[] arr, int target, int start, int end){
        boolean check = arr[start] < arr[end];
        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(check){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
